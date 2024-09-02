package org.example;

public enum DaysOfWeek {
    MONDAY("Monday", true),
    TUESDAY("Tuesday", true),
    WEDNESDAY("Wednesday", true),
    THURSDAY("Thursday", true),
    FRIDAY("Friday", true),
    SATURDAY("Saturday", false),
    SUNDAY("Sunday", false);

    private final String value;
    private final boolean weekday;

    DaysOfWeek(String value, boolean weekday) {
        this.value = value;
        this.weekday = weekday;
    }

    public String getValue() {
        return value;
    }

    public boolean isWeekday() {
        return weekday;
    }
}
