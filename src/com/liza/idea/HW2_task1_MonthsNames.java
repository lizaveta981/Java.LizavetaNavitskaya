package com.liza.idea;

public enum HW2_task1_MonthsNames {
    JANUARY("January", 1),
    FEBRUARY("February", 2),
    MARCH("March", 3),
    APRIL("April", 4),
    MAY("May", 5),
    JUNE("June", 6),
    JULY("July", 7),
    AUGUST("August",8),
    SEPTEMBER("September", 9),
    OCTOBER("October", 10),
    NOVEMBER("November",11),
    DECEMBER("December",12)
    ;

    private final String name;
    private final int number;

    HW2_task1_MonthsNames(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public static String getNameByNumber(int number) {
        for (HW2_task1_MonthsNames value : values()) {
            if (value.number == number) {
                return value.name;
            }
        }
        return null;
    }

    public static int getNumberByName(String name) {
        for (HW2_task1_MonthsNames value : values()) {
            if (value.name == name) {
                return value.number;
            }
        }

        return 0;
    }

}
