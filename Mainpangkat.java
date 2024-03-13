import java.util.Scanner;

public class Mainpangkat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        pangkat[] png = new pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            png[i] = new pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            png[i].pangkat = sc.nextInt();
        }
        System.out.println("======================================================================");

        System.out.println("Pilih metode:");
        System.out.println("1. Pangkat Brute Force");
        System.out.println("2. Pangkat Divide and Conquer");
        System.out.print("Pilihan Anda: ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                calculatePowersBF(png, elemen);
                break;
            case 2:
                calculatePowersDC(png, elemen);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

    }

    public static void calculatePowersBF(pangkat[] png, int elemen) {
        System.out.println("Hasil Pangkat dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " +
                    png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
    }

    public static void calculatePowersDC(pangkat[] png, int elemen) {
        System.out.println("Hasil Pangkat dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " +
                    png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}