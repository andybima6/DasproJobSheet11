import java.util.Scanner;
public class ArrayDua21D03 {
    public static void main(String[] args) {
        Scanner andyNugraha031D = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Baris Yang diinginkan :");
        int Baris031D = andyNugraha031D.nextInt();
        System.out.println("Masukkan Jumlah Kolom Yang Diinginkan  :");
        int kolomm031D = andyNugraha031D.nextInt();
        andyNugraha031D.nextLine();

        String[][] pengunjung031D = new String[Baris031D][kolomm031D];
        for (int baris031D = 0; baris031D < pengunjung031D.length; baris031D++) {
            for (int kolom031D = 0; kolom031D < pengunjung031D[0].length; kolom031D++) {
                System.out.printf("Masukkan pengunjung ke [%s][%s] :", baris031D, kolom031D);
                pengunjung031D[baris031D][kolom031D] = andyNugraha031D.nextLine();
            }
            System.out.println("-----------------");
        }
        for (String array [] : pengunjung031D) {
            for (String ar : array) {
                System.out.printf("%s",ar);
            }
            System.out.println("");
        }
    }
}
