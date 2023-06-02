// Составить алгоритм: на входе есть числовой массив,
// необходимо вывести элементы массива кратные 3

package DobrolezhaJava;

public class Testovoe3 {
    public static void main (String[] args) {
        int [] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Элементы массива кратные 3:");

        for (int x : Array) {
            if (x % 3 == 0) {
                System.out.println(x);
            }
        }

    }
}
