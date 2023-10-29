
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        LinkedList x = new LinkedList();
        boolean cikis = false;
        while (cikis == false) {
            System.out.println("1 -- basa ekle");
            System.out.println("2 -- sona ekle");
            System.out.println("3 -- araya ekle");
            System.out.println("4 -- bastir");
            System.out.println("5 -- bastan sil");
            System.out.println("6 -- sondan sil");
            System.out.println("7 -- aradan sil");
            System.out.println("0 -- cikis");
            System.out.print("islem seciniz: ");
            int islem = input.nextInt();
            System.out.println("");

            if (islem == 0) {
                cikis = true;
                return;
            } else if (islem == 1 || islem == 2 || islem == 3) {
                System.out.print("eklemek istediginiz sayi: ");
                int sayi = input.nextInt();

                switch (islem) {

                    case 1:
                        x.insertFirst(sayi);
                        break;
                    case 2:
                        x.insertLast(sayi);
                        break;
                    case 3:
                        System.out.print("hangi indexe eklemek istersin: ");
                        int sonra = input.nextInt();
                        x.insertBetween(sayi, sonra);
                        break;
                }
            } else if (islem == 4) {
                x.print();

            } else if (islem == 5) {

                x.deleteFirst();
            } else if (islem == 6) {
                x.deleteLast();
            } else if (islem == 7) {
                System.out.print("kacinci indexteki elemani silmek istersiniz: ");
                int sayi2 = input.nextInt();
                x.deleteBetween(sayi2);
            } else {
                System.out.println("invalid value..........");
            }
            x.print();
            System.out.println("------------------------------------------------------------------------------------------");
        }

    }

}
