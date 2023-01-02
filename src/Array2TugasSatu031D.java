import java.util.Scanner;
public class Array2TugasSatu031D {
public static void main(String[] args) {
    Scanner andyNugraha031D = new Scanner(System.in);
        char [] [] tabel031D = new char [8] [5];
        char[] karakter031D = {'A','n','d','y','N','u','g','r','a','h','a','P','u','t','r','a'};
        int isi031D = 0;
        for (int i = 0; i< tabel031D.length; i++){
            for(int j = 0; j< tabel031D[0].length; j++){
                tabel031D [i][j]= karakter031D [isi031D];
                isi031D++;
                if (isi031D == karakter031D.length) {
                     isi031D = 0;
                     }
                }
             }
         for (int i = 0; i< tabel031D.length; i++){
             for(int j = 0; j< tabel031D[0].length; j++){
                System.out.printf("%s \t", tabel031D [i] [j]);
                 }
             System.out.println("");
             }
        }
 }

