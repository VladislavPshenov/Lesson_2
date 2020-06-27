package my_project;

import javax.swing.*;

public enum DayOfWeek {

    SUNDAY (0 ), MONDAY(40), TUESDAY(32), WEDNESDAY(24), THURSDAY(16), FRIDAY(8), SATURDAY(0);

    private int hours;
    private String s;

    DayOfWeek (int hours) {
        this.hours = hours;
    }

    public String getWorkingHours() {
        String x;
        if (hours == 0)
            this.s = "выходной";
        else
            this.s = String.valueOf( this.hours);
            return s;

    }
}
