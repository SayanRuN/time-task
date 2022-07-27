package lesson_1_3.task_2;

import java.util.Scanner;

public class Task {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int totalTime = 0;
        int biggestTime = 0;
        int smallestTime = Integer.MAX_VALUE;
        while (true) {
            System.out.println("Сколько дней потребуется на выполнение?");
            int days = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько часов?");
            int hours = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько минут?");
            int minutes = Integer.parseInt(scanner.nextLine());
            int currentTimeTask = convertToSeconds(days, hours, minutes);
            if (currentTimeTask > biggestTime) {
                biggestTime = currentTimeTask;
            }
            if (currentTimeTask < smallestTime) {
                smallestTime = currentTimeTask;
            }
            System.out.println("Для завершения работы программы введите `end` для продолжения нажмите enter");
            String value = scanner.nextLine();
            if (value.equals("end")) {
                break;
            }
        }
        System.out.println("Всего потребуется: " + totalTime + " секунд");
        System.out.println("Самая продолжительная задача займет: " + biggestTime + " секунд");
        System.out.println("Самая короткая задача займет: " + smallestTime + " секунд");
    }

    private static int convertToSeconds(int days, int hours, int minutes) {
        int seconds = 0;
        seconds += days * 24 * 60 * 60;
        seconds += hours * 60 * 60;
        seconds += minutes * 60;
        return seconds;
    }
}
