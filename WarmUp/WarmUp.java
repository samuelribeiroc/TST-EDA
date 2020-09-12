import java.util.Scanner;

class WarmUp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] numbers = sc.nextLine().split(" ");

        StringBuilder out = new StringBuilder();

        for (String number : numbers) {
            out.append(Integer.toString((Integer.parseInt(number) * n))).append(" ");
        }

        System.out.println(out.toString().trim());
    }
}
