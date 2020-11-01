import java.util.Scanner;

class Parenteses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();

        System.out.println(validation(entrada));
    }

    private static String validation(String entrada) {
        String answer = "N";

        if (entrada.length() % 2 == 0 && entrada.charAt(0) == '(') {
            int contOpen = 0;
            int contClose = 0;

            for (int i = 0; i < entrada.length(); i++) {
                if (entrada.charAt(i) == '(') {
                    contOpen++;
                } else if (entrada.charAt(i) == ')') {
                    contClose++;
                }
            }

            if (contOpen == contClose) {
                answer = "S";
            }
        }

        return answer;
    }
}