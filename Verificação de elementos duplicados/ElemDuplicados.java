import java.util.Scanner;
/** Classe para verificar a existência de elementos duplicados em um array
 * @author Samuel Ribeiro
 */
class ElemDuplicados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] numeros = sc.nextLine().split(" ");

        System.out.println(verifica(numeros));
    }
/** Metodo que verefica se há elemento duplicado;
 * @author Samuel Ribeiro
 * @param numeros - String[] array contendo os elementos a serem comparados 
 * @return Boolean - valor da verificacao
 */
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
