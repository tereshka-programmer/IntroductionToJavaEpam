package ProgrammingWithClasses;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public void addHours(int hours) {
        int newHour = hour + hours;
        setHour(newHour);
    }

    public void addMinutes(int minutes) {
        int newMinute = minute + minutes;
        int additionalHours = newMinute / 60;
        setMinute(newMinute % 60);
        addHours(additionalHours);
    }

    public void addSeconds(int seconds) {
        int newSecond = second + seconds;
        int additionalMinutes = newSecond / 60;
        setSecond(newSecond % 60);
        addMinutes(additionalMinutes);
    }

    public static void main(String[] args) {
        Time time = new Time(12, 30, 45);
        System.out.println("Current Time: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());

        time.addHours(2);
        time.addMinutes(15);
        time.addSeconds(30);
        System.out.println("Updated Time: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
    }
}
