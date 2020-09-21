import java.util.Scanner;

class BinRecursiva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");

        int[] numbers = new int[entrada.length];

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < entrada.length; i++) {
            numbers[i] = Integer.parseInt(entrada[i]);
        }

        System.out.println(indexOf(numbers, n, 0, numbers.length - 1));
    }

    private static int indexOf(int[] v, int n, int ini, int fim) {
        int meio = (ini + fim) / 2;

        int retorno = -1;

        if (v[meio] == n) {
            retorno = meio;
        } else {
            System.out.println(meio);
            if (ini < fim) {
                if (n < v[meio]) {
                    return indexOf(v, n, ini, meio - 1);
                } else {
                    return indexOf(v, n, meio + 1, fim);
                }
            }
        }

        return retorno;
    }
}