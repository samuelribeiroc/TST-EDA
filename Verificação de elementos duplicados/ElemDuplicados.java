import java.util.Scanner;

class ElemDuplicados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] numeros = sc.nextLine().split(" ");

        System.out.println(verifica(numeros));
    }

    static boolean verifica (String[] numeros) {
        boolean retorno = false;

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if (Integer.parseInt(numeros[i]) == Integer.parseInt(numeros[j])) {
                    retorno =  true;
                }
            }
        }
        return retorno;
    }
}
