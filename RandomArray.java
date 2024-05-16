import java.util.Random;

public class RandomArray {
        public static void main(String[] args) {
            int[] array = new int[8];
            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(50) + 1;
            }

            System.out.println("Исходный массив:");
            for (int j : array) {
                System.out.print(j + " ");
            }
            System.out.println();

            for (int i = 1; i < array.length; i += 2) {
                array[i] = 0;
            }
            System.out.println("Массив после замены:");
            for (int j : array) {
                System.out.print(j + " ");
            }
            System.out.println(); // Переходим на новую строку
        }
    }


