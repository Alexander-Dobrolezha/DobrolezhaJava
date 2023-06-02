//Составить алгоритм: если введенное имя совпадает с Вячеслав,
// то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

package TestovieAstonQAAuto;

import java.util.Scanner;

public class Testovoe2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");

        String name = scanner.nextLine();
        String SlavName = "Вячеслав";

        if (name.equals(SlavName)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

}
