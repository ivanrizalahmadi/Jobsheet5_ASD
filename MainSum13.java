import java.util.Scanner;

public class MainSum13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================================================");
        System.out.println("Program Menghitung Keuntungan Total untuk Beberapa Perusahaan");
        System.out.println("(Satuan Juta. Misal 5,9)");

        System.out.print("Masukkan jumlah perusahaan: ");
        int numPerusahaan = sc.nextInt();

        System.out.print("Masukkan jumlah bulan: ");
        int numBulan = sc.nextInt();

        double[][] profits = new double[numPerusahaan][numBulan];

        System.out.println("==============================================================");

        for (int i = 0; i < numPerusahaan; i++) {
            System.out.println("Untuk Perusahaan ke-" + (i + 1));
            for (int j = 0; j < numBulan; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " = ");
                profits[i][j] = sc.nextDouble();
            }
            System.out.println("==============================================================");
        }

        for (int i = 0; i < numPerusahaan; i++) {
            double totalProfit = 0;
            for (int j = 0; j < numBulan; j++) {
                totalProfit += profits[i][j];
            }
            System.out.println("Total keuntungan perusahaan ke-" + (i + 1) + " selama " + numBulan + " bulan adalah: "
                    + totalProfit);
        }

        sc.close();
    }
}
