import java.util.Arrays;
import java.util.Scanner;

class Insere_ordenado {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] entrada = in.nextLine().split(" ");

        int[] numeros = new int[entrada.length];

        for (int i = 0; i < entrada.length; i++) {
            numeros[i] = Integer.parseInt(entrada[i]);
        }

        insereOrdenadoUltimo(numeros);

        System.out.println(Arrays.toString(numeros));
    }

    public static void insereOrdenadoUltimo(int[] listaNumerica){
        for(int i = listaNumerica.length -1; i > 0; i--) {
            if (listaNumerica[i] < listaNumerica[i-1]) {
                int aux = listaNumerica[i];
                listaNumerica[i] = listaNumerica[i - 1];
                listaNumerica[i - 1] = aux;
            }
        }
    }
}