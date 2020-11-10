import java.util.ArrayList;
import java.util.Scanner;

class WordCloud {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        Hashtable table = new Hashtable(entrada.length);

        for(String element : entrada) {
            table.put(element);
        }

        String element ="";

        while(!element.equals("fim")) {
            element = sc.nextLine();

            if(!element.equals("fim")){
                System.out.println(table.countSameIndex(element));
            }
        }
    }
}

class Hashtable {

    Object[] table;
    int size;

    public Hashtable(int size) {
        this.size = size;
        this.table =  new ArrayList[this.size];
    }

    public int countSameIndex(String element) {
        int result = 0;
        if (element != null) {
            int index =  hash(element);

            if (table[index] != null) {
                ArrayList<String> list = (ArrayList<String>) table[index];

                for(String item : list) {
                    if(item.equals(element)) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public void put(String element) {

        if (element != null) {
            int index =  hash(element);
            ArrayList<String> list = (ArrayList<String>) table[index];

            if (table[index] == null) {
                list = new ArrayList<>();
                list.add(element);
                table[index] = list;
            } else {
                list.add(element);
            }
        }
    }

    private int hash(String element) {
        return Math.abs(element.hashCode()) % this.size;
    }
}