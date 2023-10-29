
public class LinkedList {

    Node first = null;
    Node last = null;

    public void insertFirst(int x) {
        Node newNode = new Node(x);
        if (first == null) {
            first = newNode;
            last = newNode;
            System.out.println("ilk data yuklendi...........");
        } else {
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
            System.out.println("basa data yuklendi");
        }

    }

    public void insertLast(int x) {
        Node newNode = new Node(x);
        if (first == null) {
            first = newNode;
            last = newNode;
            System.out.println("ilk data yuklendi...........");
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
            System.out.println("sona data yuklendi");
        }
    }

    public void insertBetween(int x, int n) {
        Node newNode = new Node(x);
        int m = n;
        int range = 0;
        Node tmp = first;

        while (tmp != null) {
            range++;
            tmp = tmp.next;
        }

        if (first == null) {
            first = newNode;
            last = newNode;
            System.out.println("ilk data eklendi..........");
        } else {

            if (n == 0) {
                newNode.next = first;
                first.prev = newNode;
                first = newNode;
                System.out.println(n + ".(bas) indexe data eklendi");
            } else if (n == (range - 1)) {
                last.next = newNode;
                newNode.prev = last;
                last = newNode;
                System.out.println(n + ".(son) sonrasi indexe data eklendi");
            } else if (n > 0 && n < (range - 1)) {
                Node tmp2 = first;
                while (n > 0) {
                    tmp2 = tmp2.next;
                    n--;
                }
                newNode.next = tmp2.next;
                newNode.prev = tmp2;
                tmp2.next = newNode;
                newNode.next.prev = newNode;

                System.out.println(m + ". ve " + (m + 1) + ". arasina data eklendi.");
            } else {
                System.out.println("invalid value.");
            }

        }

    }

    public void deleteFirst() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        } else if (first == last) {
            first = null;
            last = null;
            System.out.println("listedeki tek eleman silindi");
        } else {
            first = first.next;
            first.prev = null;
            System.out.println("listedeki ilk eleman silindi");
        }
    }

    public void deleteLast() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        } else if (first == last) {
            first = null;
            last = null;
            System.out.println("listedeki tek eleman silindi");
        } else {
            last = last.prev;
            last.next = null;
            System.out.println("listedeki son eleman silindi");
        }
    }

    public void deleteBetween(int n) {
        int range = 0;
        Node tmp = first;
        int m = n;
        while (tmp != null) {
            range++;
            tmp = tmp.next;
        }

        if (n == 0) {
            first = first.next;
            first.prev = null;
            System.out.println("listedeki ilk eleman silindi.");
        }
        if (n == (range - 1)) {
            last = last.prev;
            last.next = null;
            System.out.println("listedeki son eleman silindi.");
        } else if (n > 0 && n < (range - 1)) { //1 //2
            Node tmp2 = first;
            while (m > 0) {
                tmp2 = tmp2.next;
                m--;
            }
            tmp2.prev.next = tmp2.next;
            tmp2.next.prev = tmp2.prev;
            tmp2.next = null;
            tmp2.prev = null;
            System.out.println((n - 1) + ". ve " + (n + 1) + ". arasindaki eleman silindi");
        }

    }

    public void print() {
        if (first == null) {
            System.out.println("It is empty.");
        } else {
            Node tmp = first;
            while (tmp != null) {
                System.out.print(tmp.data + " -> ");
                tmp = tmp.next;
            }
        }
        System.out.println("");
    }
}
