import java.util.Scanner;
 public class Array2TugasDua031D {
     public static void main(String[] args) {
         Scanner andyNugraha031D = new Scanner(System.in);
         String namaCabang031D[] = new String[3];
         String terbanyak031D = "";
         int jumlah031D[][] = new int[3][6];
         int max031D = 0, total = 0;

         for (int i = 0; i < jumlah031D.length; i++) {
             System.out.print("Masukkan Nama Lokasi Cabang : ");
             namaCabang031D[i] = andyNugraha031D.next();
             for (int j2 = 0; j2 < jumlah031D[0].length; j2++) {
                 switch (j2) {
                     case 0:
                         System.out.print("Masukkan Jumlah novel : ");
                         jumlah031D[i][j2] = andyNugraha031D.nextInt();
                         jumlah031D[i][4] += jumlah031D[i][j2];
                         jumlah031D[i][5] += jumlah031D[i][j2] * 40000;
                         break;
                     case 1:
                         System.out.print("Masukkan Jumlah komik : ");
                         jumlah031D[i][j2] = andyNugraha031D.nextInt();
                         jumlah031D[i][4] += jumlah031D[i][j2];
                         jumlah031D[i][5] += jumlah031D[i][j2] * 28000;
                         break;
                     case 2:
                         System.out.print("Masukkan Jumlah buku pelajaran : ");
                         jumlah031D[i][j2] = andyNugraha031D.nextInt();
                         jumlah031D[i][4] += jumlah031D[i][j2];
                         jumlah031D[i][5] += jumlah031D[i][j2] * 60000;
                         break;
                     case 3:
                         System.out.print("Masukkan Jumlah ensiklopedi : ");
                         jumlah031D[i][j2] = andyNugraha031D.nextInt();

                         jumlah031D[i][4] += jumlah031D[i][j2];
                         jumlah031D[i][5] += jumlah031D[i][j2] * 75000;
                         break;
                 }
             }
             total += jumlah031D[i][5];
             if (max031D < jumlah031D[i][5]) {
                 max031D = jumlah031D[i][5];
                 terbanyak031D = namaCabang031D[i];
             }
         }

         System.out.println("=========================================================================================================================");

         System.out.println("|Cabang\t\t|Novel\t\t|Komik\t\t|BukuPelajaran\t|Ensiklopedi\t|Total\t\t| Pemasukan\t\t|");

         System.out.println("=========================================================================================================================");
         for (int i = 0; i < jumlah031D.length; i++) {
             System.out.print("|" + namaCabang031D[i] + "\t\t|");
             for (int j = 0; j < jumlah031D[0].length; j++) {
                 System.out.print("|" + jumlah031D[i][j] + "\t\t|");
             }
             System.out.println("");
         }

         System.out.println("=========================================================================================================================");
         System.out.println("|Total Pemasukan PT TOGAMAS adalah Rp. " + total +
                 "\t\t\t\t\t\t\t\t\t\t|");
         System.out.println("=========================================================================================================================");
         System.out.println("|Cabang dengan pemasukan terbanyak adalah Cabang " + terbanyak031D + "\t\t\t\t\t\t\t\t\t|");

         System.out.println("=========================================================================================================================");
     }
 }
