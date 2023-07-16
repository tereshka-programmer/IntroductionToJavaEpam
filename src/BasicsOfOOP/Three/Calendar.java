package BasicsOfOOP.Three;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Holiday> holidays;

    public Calendar() {
        this.holidays = new ArrayList<>();
    }

    public void addHoliday(String date, String name) {
        Holiday holiday = new Holiday(date, name);
        holidays.add(holiday);
    }

    public void printHolidays() {
        for (Holiday holiday : holidays) {
            System.out.println(holiday);
        }
    }

    public class Holiday {
        private String date;
        private String name;

        public Holiday(String date, String name) {
            this.date = date;
            this.name = name;
        }

        public String getDate() {
            return date;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Holiday{" +
                    "date='" + date + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        calendar.addHoliday("01-01-2022", "Новый год");
        calendar.addHoliday("08-03-2022", "Международный женский день");

        calendar.printHolidays();
    }
}
