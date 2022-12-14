package polyakov.nametranscriptor.model.rulesets;

public class Slovak extends Czech {

    @Override
    public String transcribe(String name, int mode) {
        name = checkStart(name);
        if (mode == 1) {
            name = checkEnd(name);
        }
        name = checkCustomCases(name);
        name = checkSlovakCombinations(name);
        name = checkCombinations(name);
        name = checkSlovakChars(name);
        name = checkSingleChars(name);
        return name;
    }

    private String checkSlovakCombinations(String name) {
        name = name.replace("ľa", "ля");
        name = name.replace("ľo", "ле");
        name = name.replace("ľó", "ле");
        name = name.replace("ľu", "лю");
        name = name.replace("ľú", "лю");
        name = name.replace("čia", "ча");
        name = name.replace("šia", "ша");
        name = name.replace("ia", "ья");
        name = name.replace("čiu", "чу");
        name = name.replace("šiu", "шу");
        name = name.replace("iu", "ью");
        name = name.replace("iэ", "ье");
        return name;
    }

    private String checkSlovakChars(String name) {
        name = name.replace("ä", "е");
        name = name.replace("ô", "уо");
        name = name.replace("ĺ", "л");
        name = name.replace("ľ", "ль");
        name = name.replace("ŕ", "р");
        return name;
    }
}