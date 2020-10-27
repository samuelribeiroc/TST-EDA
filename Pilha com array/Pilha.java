import java.util.Scanner;

class Pilha {

    private int[] array;
    private int peek;

    public Pilha(int size) {
        this.array = new int[size];
        this.peek = -1;
    }

    public void push(int elem) {
        if (!isFull()) {
            this.array[++this.peek] = elem;
        } else {
            System.out.println("full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            this.peek--;
        } else {
            System.out.println("empty");
        }
    }

    public boolean isEmpty() {
        return (this.peek == -1);
    }

    public boolean isFull() {
        return (this.peek == this.array.length - 1);
    }

    public String print() {
        String arrayString = "";

        if (isEmpty()) {
            arrayString = "empty";
        } else {
            for (int i = 0; i <= peek; i++) {
                String elem = Integer.toString(this.array[i]);
                arrayString += elem + " ";
            }
        }

        return arrayString.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String start = sc.nextLine();

        Pilha pilha = new Pilha(Integer.parseInt(start));

        String[] entrada = new String[2];

        entrada[0] = "";

        while (!entrada[0].equals("end")) {
            entrada = sc.nextLine().split(" ");

            if (entrada[0].equals("push")) {
                pilha.push(Integer.parseInt(entrada[1]));
            } else if (entrada[0].equals("pop")) {
                pilha.pop();
            } else if (entrada[0].equals("peek")) {
                if (pilha.peek > -1) {
                    System.out.println(pilha.array[pilha.peek]);
                } else {
                    System.out.println("empty");
                }
            } else if (entrada[0].equals("print")) {
                System.out.println(pilha.print());
            }

        }

        sc.close();
    }
}