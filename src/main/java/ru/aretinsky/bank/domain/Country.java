package ru.aretinsky.bank.domain;

public enum Country {
    RUSSIA(7, "Россия"),
    UKRAINE(380, "Украина"),
    BELARUS(375, "Беларусь"),
    KAZAKHSTAN(7, "Казахстан"),
    AZERBAIJAN(994, "Азербайджан"),
    ARMENIA(374, "Армения"),
    GEORGIA(995, "Грузия"),
    KYRGYZSTAN(996, "Киргизия"),
    MOLDOVA(373, "Молдовия"),
    TAJIKISTAN(992, "Таджикистан"),
    TURKMENISTAN(993, "Туркмения"),
    UZBEKISTAN(998, "Узбекистан");

    public final int code;
    public final String country;

    Country(int code, String country) {
        this.code = code;
        this.country = country;
    }
}
