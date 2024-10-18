import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        stop:
        while (true) {
            menu();
            int input = scanner.nextInt();
            switch (input) {
                case 0:
                    System.out.println("Программа завершена");
                    break stop;
                case 1:
                    System.out.print("введите название задачи:");
                    String a = scanner.next();
                    add(a, list);
                    System.out.print("Добавлено!\n" +
                            "Ваш список дел: ");
                    showList(list);
                    break;
                case 2:
                    System.out.println("Список дел на данный момент");
                    showList(list);
                    break;
                case 3:
                    showList(list);
                    System.out.print("введите номер задачи для удаления:");
                    int number = scanner.nextInt();
                    deleteNumber(number, list);
                case 4:
                    showList(list);
                    System.out.println("введите название задачи для удаления");
                    String text = scanner.next();
                    deleteName(text, list);

            }
        }
    }

    public static void deleteName(String text, ArrayList<String> list) {
        if (list.contains(text)) {
            for (int i = 0; i < list.size(); i++) {
                if (text.equals(list.get(i))) {
                    deleteNumber(i + 1, list);
                    System.out.println("Задача с названием " + text + " удалена");
                }
            }
        } else {
            System.out.println("Задача с названием " + text + " не существует");
        }

    }

    public static void menu() {
        System.out.println("Выберите операцию:\n" +
                "\n" +
                "0. Выход из программы\n" +
                "1. Добавить дело\n" +
                "2. Показать дела\n" +
                "3. Удалить дело по номеру\n" +
                "4. Удалить дело по названию\n"
        );
    }

    public static void showList(ArrayList<String> list) {
        if (list.size() == 0) {
            System.out.println("Список пуст");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
        }
    }

    public static void add(String a, ArrayList<String> list) {
        list.add(a);
    }

    public static void deleteNumber(int number, ArrayList<String> list) {
        if (list.size() >= number) {
            list.remove(number - 1);
            System.out.println("задача под номером " + number + " удалена");
        } else {
            System.out.println("задача под номером " + number + " не существует");
        }
    }
}
