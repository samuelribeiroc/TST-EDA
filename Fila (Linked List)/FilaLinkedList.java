import java.util.Scanner;

class FilaLinkedList {

    private FilaLinkedList head;
    private int data;
    private FilaLinkedList previous;
    private FilaLinkedList next;

    public FilaLinkedList() {
        this.data = -1;
    }

    public FilaLinkedList(int data) {
        this.data = data;
        this.previous = new FilaLinkedList();
        this.next = new FilaLinkedList();
    }

    public FilaLinkedList(int data, FilaLinkedList head) {
        this.data = data;
        this.previous = new FilaLinkedList();
        this.next = new FilaLinkedList();
        this.head = head;
    }

    public void add(int data) {
        FilaLinkedList newNode = new FilaLinkedList(data);
        if (isEmpty()) {
            new FilaLinkedList(data, newNode);
            setHead(newNode);
        } else if (this.head.isNil()) {
            this.setHead(newNode);
        } else {
            FilaLinkedList atual = this.getHead();

            while (!atual.getNext().isNil()) {
                atual = atual.getNext();
            }

            newNode.setPrevious(atual);
            atual.setNext(newNode);
        }
    }

    public void remove() {
        if (!isEmpty() && !this.head.isNil()) {
            this.getHead().getPrevious().setNext(this.getHead().getNext());
            this.getHead().getNext().setPrevious(this.getHead().getPrevious());
            this.setHead(this.getHead().getNext());
        } else {
            System.out.println("empty");
        }
    }

    public boolean isEmpty() {
        return (this.head == null);
    }

    public boolean isNil() {
        return (this.data == -1);
    }

    public int getData() {
        return this.data;
    }

    public FilaLinkedList getHead() {
        return this.head;
    }

    public FilaLinkedList getNext() {
        return next;
    }

    public FilaLinkedList getPrevious() {
        return previous;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setHead(FilaLinkedList head) {
        this.head = head;
    }

    public void setNext(FilaLinkedList next) {
        this.next = next;
    }

    public void setPrevious(FilaLinkedList previous) {
        this.previous = previous;
    }

    public int size() {
        return this.size(this.getHead());
    }

    private int size(FilaLinkedList aux) {
        int size = 0;

        if (aux != null) {
            while (!aux.isNil()) {
                size += 1 + size(aux.getNext());
            }
        }

        return size;
    }

    public String print() {
        String arrayString = "";

        FilaLinkedList aux = this.head;

        if (isEmpty()) {
            arrayString = "empty";
        } else {
            while (!aux.isNil()){
                String elem = Integer.toString(aux.getData());
                arrayString += elem + " ";
                aux = aux.getNext();
            }
        }

        return arrayString.trim();
    }

    public int search(int data) {
        int i = -1;

        if (!isEmpty()) {
            FilaLinkedList aux = this.head;

            while (!aux.isNil()) {
                i++;
                if (aux.getData() == data) {
                    break;
                } else {
                    aux = aux.getNext();
                }
            }

            if (aux.getData() != data) {
                i = -1;
            }
        }

        return i;
    }

    public String element () {
        String i = "";

        if (!isEmpty()) {
            FilaLinkedList aux = this.getHead();

            while (!aux.getNext().isNil()) {
                aux = aux.getNext();
            }

            i = Integer.toString(aux.getData());
        } else {
            i = "empty";
        }

        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = new String[2];

        FilaLinkedList fila = new FilaLinkedList();

        entrada[0] = "";

        while (!entrada[0].equals("end")) {
            entrada = sc.nextLine().split(" ");

            if (entrada[0].equals("add")) {
                fila.add(Integer.parseInt(entrada[1]));
            } else if (entrada[0].equals("remove")) {
                fila.remove();
            } else if (entrada[0].equals("element")) {
                System.out.println(fila.element());
            } else if (entrada[0].equals("print")) {
                System.out.println(fila.print());
            } else if (entrada[0].equals("search")) {
                System.out.println(fila.search(Integer.parseInt(entrada[1])));
            }

        }

        sc.close();
    }
}