package polyakov.nametranscriptor.ruleset.resources.popularnames;

public enum PolishNames {
    ADRIAN("adrian", "адриан"),
    ADRIANA("adriana", "адриана"),
    ADRIANNA("adrianna", "адрианна"),
    ADRIEN("adrien", "адриен"),
    ALOJZY("alojzy", "алоизий"),
    AMBROZY("ambrozy", "амброзий"),
    AMELIA("amelia", "амелия"),
    ANTONI("antoni", "антоний"),
    ANTONIO("antonio", "антонио"),
    ARIEL("ariel", "ариэль"),
    AUGUSTYN("augustyn", "аугустин"),
    ARKADY("arkady", "аркадий"),
    BENEDYKT("benedykt", "бенедикт"),
    BORYS("borys", "борис"),
    BORYSLAW("boryslaw", "борислав"),
    BRYGIDA("brygida", "бригида"),
    CECYLIA("cecylia", "цецилия"),
    CELESTYN("celestyn", "целестин"),
    CEZARY("cezary", "цезарий"),
    CHRYSTIAN("chrystian", "кристиан"),
    CYPRIAN("cyprian", "циприан"),
    DAMIAN("damian", "дамиан"),
    DAMIANA("damiana", "дамиана"),
    DANIEL("daniel", "даниель"),
    DANIELA("daniela", "даниела"),
    DARIA("daria", "дарья"),
    DIANA("diana", "диана"),
    DMITRY("dymitry", "дмитрий"),
    EMILIA("emilia", "эмилия"),
    ERYK("eryk", "эрик"),
    EVELYN("evelyn", "эвелин"),
    EUGENIA("eugenia", "эугения"),
    FABIAN("fabian", "фабиан"),
    FABIANA("fabiana", "фабиана"),
    FAUSTYNA("faustyna", "фаустина"),
    FERDYNAND("ferdynand", "фердинанд"),
    FRYDERYK("fryderyk", "фредерик"),
    GABRIEL("gabriel", "габриэл"),
    GABRIELA("gabriela", "габриэла"),
    GRAZYNA("grazyna", "гражина"),
    HENRY("henry", "генри"),
    HENRYK("henryk", "генрик"),
    HENRYKA("henryka", "генрика"),
    IZYDOR("izydor", "изидор"),
    JERZY("jerzy", "ежи"),
    JUDYTA("judyta", "юдита"),
    JULIA("julia", "юлиа"),
    JULIAN("julian", "юлиан"),
    JULIANA("juliana", "юлиана"),
    JUSTYNA("justyna", "юстина"),
    KLAUDIA("klaudia", "клаудия"),
    KONSTANTYN("konstantyn", "константин"),
    KORNELIA("kornelia", "корнелия"),
    KRYSPYN("kryspyn", "криспин"),
    KRYSTIAN("krystian", "кристиан"),
    KRYSTYN("krystyn", "кристин"),
    KRYSTYNA("krystyna", "кристина"),
    KSAWERY("ksawery", "ксаверий"),
    LIANA("liana", "лиана"),
    LIDIA("lidia", "лидия"),
    LILIA("lilia", "лилия"),
    LILIANA("liliana", "лилиана"),
    LUIS("luis", "луис"),
    LUIZA("luiza", "луиза"),
    LUKASZ("lukasz", "лукаш"),
    MAKARY("makary", "макарий"),
    MAKSYMILIAN("maksymilian", "максимилиан"),
    MARCELI("marceli", "марцелий"),
    MARIA("maria", "мария"),
    MARIAN("marian", "мариан"),
    MARIANA("mariana", "мариана"),
    MARIANNA("marianna", "марианна"),
    MARIOLA("mariola", "марьола"),
    MARIUS("marius", "мариус"),
    MARTYNA("martyna", "мартина"),
    MARYN("maryn", "марин"),
    MARYNA("maryna", "марина"),
    MAURYCJUSZ("maurycjusz", "маурицьюш"),
    MAURYCY("maurycy", "мауриций"),
    MELANIA("melania", "мелания"),
    MIECZYSLAW("mieczyslaw", "мечислав"),
    NATALIA("natalia", "наталья"),
    OKTAWIAN("oktawian", "октавиан"),
    OLIWIA("oliwia", "оливия"),
    PAFNUCY("pafnucy", "пафнуций"),
    PATRYCJA("patrycja", "патрицья"),
    PATRYK("patryk", "патрик"),
    SEBASTIAN("sebastian", "себастиан"),
    SEWERYN("seweryn", "северин"),
    STEFANIA("stefania", "стефания"),
    SYLWESTER("sylwester", "сильвестр"),
    SYLWIA("sylwia", "сильвия"),
    SZYMON("szymon", "шимон"),
    TATIANA("tatiana", "татьяна"),
    TYMON("tymon", "тимон"),
    TYMOTEUSZ("tymoteusz", "тимотеуш"),
    TYTUS("tytus", "титус"),
    URSZULA("urszula", "уршула"),
    WALENTY("walenty", "валентий"),
    WIKTORIA("wiktoria", "виктория"),
    WINCENTY("wincenty", "винцентий"),
    WLADYSLAW("wladyslaw", "владислав"),
    ZYGFRYD("zygfryd", "зигфрид"),
    ZYGMUND("zygmund", "зигмунд"),
    ZYGMUNT("zygmunt", "зигмунт"),
    ZYTOMIR("zytomir", "житомир"),
    WALENTYNA("walentyna", "валентина"),
    ZOFIA("zofia", "зофия"),
    ZYGFRYDA("zygfryda", "зигфрида"),
    ZYWIA("zywia", "живя");

    private final String latinName;
    private final String cyrillicName;

    PolishNames(String latinName, String cyrillicName) {
        this.latinName = latinName;
        this.cyrillicName = cyrillicName;
    }

    public String getLatinName() {
        return latinName;
    }

    public String getCyrillicName() {
        return cyrillicName;
    }
}