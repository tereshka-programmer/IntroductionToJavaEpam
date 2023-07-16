package BasicsOfSoftwareDevelopment.linearPrograms;

public class Five {

    public static void main(String[] args) {
        int T = 3666; // Замените значение на нужное

        int hours = T / 3600; // Получаем количество часов
        int minutes = (T % 3600) / 60; // Получаем количество минут
        int seconds = (T % 3600) % 60; // Получаем количество секунд

        String formattedTime = String.format("%02dч %02dмин %02dс", hours, minutes, seconds);
        System.out.println("Длительность времени: " + formattedTime);
    }

}
