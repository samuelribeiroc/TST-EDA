import java.util.Arrays;
import java.util.Scanner;

class FuraFila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");

        int position = Integer.parseInt(sc.nextLine());

        operation(entrada, position);
    }

    private static void operation(String[] array, int position) {
        int positionAux = position;
        int posChange = 0;

        while (positionAux < array.length) {
            String change = array[positionAux];

            for (int i = positionAux; i > posChange; i--) {
                array[i] = array[i-1];
            }

            array[posChange] = change;
            System.out.println(Arrays.toString(array));
            positionAux++;
            posChange++;
        }
    }
}