import java.util.Arrays;
import java.util.Scanner;

class Selection_recursivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");

        int[] numeros = new int[entrada.length];

        for (int i = 0; i < entrada.length; i++) {
            numeros[i] = Integer.parseInt(entrada[i]);
        }

        System.out.println(Arrays.toString(sort(numeros, 0, numeros.length - 1)));
    }

    private static int[] sort(int[] array, int leftIndex, int rightIndex) {
        if (array != null && leftIndex >= 0 && rightIndex <= array.length - 1
                && array.length > 1) {
            int minor_index = leftIndex;

            if (leftIndex < rightIndex) {
                for (int i = leftIndex; i < rightIndex + 1; i++) {
                    if (array[i]< array[minor_index]) {
                        minor_index = i;
                    }
                }

                int aux = array[minor_index];
                array[minor_index] = array[leftIndex];
                array[leftIndex] = aux;

                if (leftIndex + 1 < rightIndex) {
                    System.out.println(Arrays.toString(array));
                }

                return sort(array, leftIndex + 1, rightIndex);
            } else {
                return array;
            }
        } else {
            return array;
        }
    }
}