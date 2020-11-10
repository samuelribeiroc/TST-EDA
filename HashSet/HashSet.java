import java.util.Scanner;

class HashSet {

    private int[] hash;

    public HashSet(int size) {
        this.hash = new int[size];
        for (int a = 0; a < this.hash.length; a++) {
            this.hash[a] = -1;
        }
    }

    private int hash(int number) {
        return number % this.hash.length;
    }

    public void put(int number) {
        if (!this.contains(number) && !this.isFull()) {
            int hashCode = hash(number);
            int cont = 0;

            while (cont < this.hash.length && this.hash[hashCode] != -1) {
                hashCode = (hash(number) + cont) % this.hash.length;
                cont++;
            }

            this.hash[hashCode] = number;
        }
        System.out.println(print());
    }

    public void remove(int number) {
        if (this.contains(number)) {
            for (int i = 0; i < this.hash.length; i++) {
                if (this.hash[i] == number) {
                    this.hash[i] = -1;
                }
            }
        }
        System.out.println(print());
    }

    public boolean contains(int number) {
        boolean validate = false;

        for (int a : this.hash) {
            if (a == number) {
                validate = true;
                break;
            }
        }

        return validate;
    }

    private String print() {
        String set = "[";
        int cont = 0;

        while (cont < this.hash.length - 1){
            if (this.hash[cont] == -1) {
                set += "null, ";
            } else {
                set += this.hash[cont] + ", ";
            }
            cont++;
        }

        if (this.hash[cont] == -1) {
            set += "null]";
        } else {
            set += this.hash[cont] + "]";
        }

        return set;
    }

    private boolean isFull() {
        boolean validate = true;
        int i = 0;

        while (i < this.hash.length && validate != false) {
            if (this.hash[i] == -1) {
                validate = false;
            }
            i++;
        }

        return validate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = sc.nextInt();

        String[] entrada = new String[2];

        HashSet hashSet = new HashSet(tamanho);

        entrada[0] = "";

        while (!entrada[0].equals("end")) {
            entrada = sc.nextLine().split(" ");

            if (entrada[0].equals("put")) {
                hashSet.put(Integer.parseInt(entrada[1]));
            } else if (entrada[0].equals("remove")) {
                hashSet.remove(Integer.parseInt(entrada[1]));
            } else if (entrada[0].equals("contains")) {
                System.out.println(hashSet.contains(Integer.parseInt(entrada[1])));
            }

        }

        sc.close();
    }
}
