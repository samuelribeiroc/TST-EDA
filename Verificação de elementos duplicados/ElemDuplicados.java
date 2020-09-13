import java.util.Scanner;

class ElemDuplicados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] numeros = sc.nextLine().split(" ");

        boolean verifica = false;

        int cont = 0;

        while (cont < numeros.length && verifica == false) {

            int cont2 = 0;

            while (cont2 < numeros.length && verifica == false) {
                if (cont != cont2) {
                    if (Integer.parseInt(numeros[cont]) == Integer.parseInt(numeros[cont2])) {
                        verifica = true;
                    }
                }
                cont2++;
            }

            cont++;
        }

        System.out.println(verifica);
    }
}