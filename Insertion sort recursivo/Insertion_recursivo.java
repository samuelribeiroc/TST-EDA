import java.util.Arrays;
import java.util.Scanner;

class Insertion_recursivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");

        int[] inteiros = new int[entrada.length];

        for (int i = 0; i < entrada.length; i++) {
            inteiros[i] = Integer.valueOf(entrada[i]);
        }

        sort(inteiros, 0, inteiros.length - 1);
    }

    private static void sort(int[] array, int leftIndex, int rightIndex) {
        for (int i = leftIndex; i > 0; i--) {
            if (array[i] < array[i - 1]) {
                int aux = array[i];
                array[i] = array[i - 1];
                array[i - 1] = aux;
            }
        }
        if (leftIndex != 0) {
            printArray(array);
        }
        if (leftIndex < rightIndex) {
            leftIndex++;
            sort(array, leftIndex, rightIndex);
        }
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}