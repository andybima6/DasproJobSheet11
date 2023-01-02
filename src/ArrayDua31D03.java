import java.util.Scanner;
public class ArrayDua31D03 {
    public static void main(String[] args) {
        Scanner andyNugraha031D = new Scanner(System.in);

        int data031D[][] = new int[4][4];
        int jam031D[] = {3, 6, 9, 12};
        int min031D[] = {100, 100, 100, 100};
        int max031D[] = new int[4];
        double total031D[] = {0, 0, 0, 0};
        double rata031D[] = {0, 0, 0, 0};

        for (int i = 0; i < data031D.length; i++) {
            System.out.printf("Jam %s\n", jam031D[i]);
            for (int j = 0; j < data031D[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Masukkan suhu :");
                        data031D[i][j] = andyNugraha031D.nextInt();
                        if (min031D[j] > data031D[i][j]) {
                            min031D[j] = data031D[i][j];
                        }
                        total031D[j] += data031D[i][j];
                        break;
                    case 1:
                        System.out.print("Masukkan Kelembapan :");
                        data031D[i][j] = andyNugraha031D.nextInt();
                        if (min031D[j] > data031D[i][j]) {
                            min031D[j] = data031D[i][j];
                        }
                        total031D[j] += data031D[i][j];
                        break;
                    case 2:
                        System.out.print("Masukkan Kecepatan Angin :");
                        data031D[i][j] = andyNugraha031D.nextInt();
                        if (min031D[j] > data031D[i][j]) {
                            min031D[j] = data031D[i][j];
                        }
                        total031D[j] += data031D[i][j];
                        break;
                    case 3:
                        System.out.print("Masukkan Indek UV :");
                        data031D[i][j] = andyNugraha031D.nextInt();
                        if (min031D[j] > data031D[i][j]) {
                            min031D[j] = data031D[i][j];
                        }
                        if (max031D[j] >data031D[i][j]){
                            min031D[j] = data031D [i][j];
                        }
                        total031D[j] += data031D[i][j];
                        break;
                }
                rata031D[j] = total031D[j] / data031D[0].length;
            }
        }
        for (int i = 0;i < max031D.length;i++){
            System.out.println(max031D[i] + " ");
        }
        System.out.println();
        System.out.println("-----------ANDY NUGRAHA PUTRA----------");
        for (int i = 0; i < data031D[0].length; i++) {
            for (int j = 0; j < data031D[0].length; j++) {
                System.out.print(data031D[i][j] + " ");
                {
                }
                System.out.println(" ");
            }
            System.out.println("----------------------------------------");
            System.out.printf("Rata Rata Suhu : %.2f\n", rata031D[0]);
            System.out.printf("Persentase Kelembapan Terendah : %s\n", min031D[1]);
            System.out.printf("Presentase Index UV Tertinggi : %s\n",min031D[3]);
        }
    }
}