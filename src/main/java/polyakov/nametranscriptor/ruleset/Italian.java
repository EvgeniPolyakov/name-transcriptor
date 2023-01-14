package polyakov.nametranscriptor.ruleset;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import polyakov.nametranscriptor.ruleset.resources.popularnames.ItalianNames;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static polyakov.nametranscriptor.ruleset.resources.wordparts.Italian.*;

@Component
public class Italian implements Ruleset {
    @Override
    public String transcribe(String name, int mode) {
        name = StringUtils.stripAccents(name);
        Optional<String> checkedName = checkPopularNames(name);
        if (checkedName.isPresent()) {
            return checkedName.get();
        }
        name = checkPrimaryCases(name);
        name = checkSoftenedVowels(name);
        name = checkVowels(name);
        if (name.contains("l")) {
            name = checkCasesOfL(name);
        }
        if (name.contains("s")) {
            name = checkCasesOfS(name);
        }
        if (name.contains("i")) {
            name = checkIotation(name);
        }
        name = checkStart(name);
        name = checkEndings(name);
        name = checkCombinations(name);
        name = checkSingleChars(name);
        return name;
    }

    private static String checkSingleChars(String name) {
        name = name.replace("a", "а");
        name = name.replace("b", "б");
        name = name.replace("c", "к");
        name = name.replace("d", "д");
        name = name.replace("e", "е");
        name = name.replace("f", "ф");
        name = name.replace("g", "г");
        name = name.replace("h", "");
        name = name.replace("i", "и");
        name = name.replace("j", "й");
        name = name.replace("k", "к");
        name = name.replace("l", "ль");
        name = name.replace("m", "м");
        name = name.replace("n", "н");
        name = name.replace("o", "о");
        name = name.replace("p", "п");
        name = name.replace("q", "к");
        name = name.replace("r", "р");
        name = name.replace("s", "с");
        name = name.replace("t", "т");
        name = name.replace("u", "у");
        name = name.replace("v", "в");
        name = name.replace("w", "в");
        name = name.replace("x", "кс");
        name = name.replace("y", "и");
        name = name.replace("z", "ц");
        return name;
    }

    private static String checkPrimaryCases(String name) {
        name = name.replace("aqua", "акуa");
        name = name.replace("cce", "ччe");
        name = name.replace("sce", "шe");
        name = name.replace("sci", "шi");
        name = name.replace("ce", "чe");
        name = name.replace("cci", "ччi");
        name = name.replace("ci", "чi");
        name = name.replace("gge", "джe");
        name = name.replace("ggi", "джi");
        name = name.replace("ge", "джe");
        name = name.replace("gi", "джi");
        return name;
    }

    private static String checkCombinations(String name) {
        name = name.replace("iago", "иаgo");
        name = name.replace("iaлe", "иалe");
        name = name.replace("iano", "иаno");
        name = name.replace("iasco", "иаsco");
        name = name.replace("iato", "иаto");
        name = name.replace("ia", "ья");
        name = name.replace("cк", "кк");
        name = name.replace("ch", "к");
        name = name.replace("gg", "гг");
        name = name.replace("gh", "г");
        name = name.replace("gna", "нья");
        name = name.replace("gn", "нь");
        name = name.replace("ie", "ье");
        name = name.replace("ii", "ьи");
        name = name.replace("ioлa", "иола");
        name = name.replace("ioлo", "иоло");
        name = name.replace("io", "ьо");
        name = name.replace("iu", "ью");
        name = name.replace("ja", "я");
        name = name.replace("je", "е");
        name = name.replace("jo", "йо");
        name = name.replace("ju", "ю");
        name = name.replace("qu", "кв");
        return name;
    }

    private static String checkVowels(String name) {
        for (String vowel : VOWELS) {
            for (String vowel2 : VOWELS) {
                name = name.replace(vowel + "s" + vowel2, vowel + "з" + vowel2);
            }
            name = name.replace("ggi" + vowel, "дж" + vowel);
            name = name.replace("cci" + vowel, "чи" + vowel);
            name = name.replace("шi" + vowel, "ш" + vowel);
            name = name.replace("l" + vowel, "л" + vowel);
            for (Map.Entry<String, String> beforeVowel : BEFORE_VOWELS.entrySet()) {
                name = name.replace(beforeVowel.getKey() + vowel, beforeVowel.getValue() + vowel);
            }
        }
        for (String vowel : VOWELS) {
            for (Map.Entry<String, String> afterVowel : AFTER_VOWELS.entrySet()) {
                name = name.replace(vowel + afterVowel.getKey(), vowel + afterVowel.getValue());
            }
            if (!vowel.equals("i")) {
                name = name.replace(vowel + "e", vowel + "э");
            }
        }
        return name;
    }

    private static String checkSoftenedVowels(String name) {
        for (Map.Entry<String, String> comb : SOFT_COMBINATIONS.entrySet()) {
            for (Map.Entry<String, String> vowel : SOFTENED_VOWELS.entrySet()) {
                name = name.replace(comb.getKey() + vowel.getKey(), comb.getValue() + vowel.getValue());
            }
        }
        return name;
    }

    private static String checkStart(String name) {
        if (name.startsWith("zz")) {
            return name.replaceFirst("zz", "дз");
        }
        if (name.startsWith("h")) {
            name = name.replaceFirst("h", "");
        }
        for (Map.Entry<String, String> starter : STARTERS.entrySet()) {
            if (name.startsWith(starter.getKey())) {
                return name.replaceFirst(starter.getKey(), starter.getValue());
            }
        }
        return name;
    }

    private static String checkEndings(String name) {
        for (Map.Entry<String, String> ending : FIRST_TIER_ENDINGS.entrySet()) {
            if (name.endsWith(ending.getKey())) {
                String sub = name.substring(0, name.length() - ending.getKey().length());
                return sub + ending.getValue();
            }
        }
        for (Map.Entry<String, String> ending : SECOND_TIER_ENDINGS.entrySet()) {
            if (name.endsWith(ending.getKey())) {
                String sub = name.substring(0, name.length() - ending.getKey().length());
                return sub + ending.getValue();
            }
        }
        return name;
    }

    private static String checkCasesOfL(String name) {
        if (name.endsWith("ll")) {
            return name.substring(0, name.length() - 2) + "ль";
        }
        name = name.replace("ll", "лл");
        name = name.replace("lл", "лл");
        name = name.replace("lь", "ль");
        return name;
    }

    private static String checkCasesOfS(String name) {
        for (String consonant : List.of("l", "m", "n", "v", "л")) {
            name = name.replace("s" + consonant, "з" + consonant);
        }
        return name;
    }

    private static String checkIotation(String name) {
        for (String vowel : VOWELS) {
            name = name.replace(vowel + "i", vowel + "й");
        }
        return name;
    }

    private static Optional<String> checkPopularNames(String name) {
        return Arrays.stream(ItalianNames.values())
                .filter(s -> s.getLatinName().equals(name))
                .findAny()
                .map(ItalianNames::getCyrillicName);
    }

    @Override
    public String getName() {
        return RulesetName.ITALIAN.getName();
    }
}