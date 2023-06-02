//Составить алгоритм: если введенное число больше 7, то вывести “Привет”

package TestovieAstonQAAuto;

import java.util.Scanner;

public class Testovoe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Введите, пожалуйста, число");

        }
            int number = scanner.nextInt();
            if (number > 7) {
                System.out.println("Привет");
            } else if (number <= 7) {
                System.out.println("Введите число больше 7");
            }

    }
}