import java.util.Scanner;

class TeoMestre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");

        int[] numeros = new int[entrada.length];

        for (int i = 0; i < entrada.length; i++) {
            numeros[i] = Integer.parseInt(entrada[i]);
        }

        System.out.println("T(n) = theta(" + teoremaMestre(numeros) + ")");

        sc.close();

    }

    private static String teoremaMestre(int[] numeros) {
        int a = numeros[0];
        int b = numeros[1];
        int ord = numeros[2];

        double resultado = Math.log10(a) / Math.log10(b);

        if (ord > resultado) {
            return "n**" + String.valueOf(ord);
        } else if (ord < resultado) {
            return "n**" + String.valueOf(ord) + " ** " + resultado;
        } else {
            return "n**" + String.valueOf(ord) + " * log n";
        }
    }
}