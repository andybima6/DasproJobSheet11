import java.util.Scanner;
public class ArrayDua11D03 {
    public static void main(String[] args) {
        Scanner andyNugraha031D = new Scanner(System.in);

        String[][] pengunjung031D = new String[4][2];

        pengunjung031D[0][0] = "Amin";
        pengunjung031D[0][1] = "Bena";
        pengunjung031D[2][0] = "Eka";
        pengunjung031D[2][1] = "Farhan";

        System.out.printf("%s \t %s\n", pengunjung031D[0][0], pengunjung031D[0][1]);
        System.out.printf("%s \t %s\n", pengunjung031D[1][0], pengunjung031D[1][1]);
        System.out.printf("%s \t %s\n", pengunjung031D[2][0], pengunjung031D[2][1]);
        System.out.printf("%s \t %s\n", pengunjung031D[3][0], pengunjung031D[3][1]);
    }
}