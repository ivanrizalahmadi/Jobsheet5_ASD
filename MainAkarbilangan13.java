import java.util.Scanner;

public class MainAkarbilangan13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================================================");
        System.out.println("Program Menghitung Akar Bilangan (Bulatkan ke Bawah jika Bukan Kuadrat Sempurna)");
        System.out.println("Masukkan bilangan yang ingin dihitung akarnya: ");
        int angka = sc.nextInt();

        int hasilBruteForce = Akarbilangan13.bruteForceSqrt(angka);

        int hasilDivideConquer = Akarbilangan13.divideConquerSqrt(angka);

        System.out.println("Bilangan: " + angka);
        System.out.println("Akar dengan Algoritma Brute Force: " + hasilBruteForce);
        System.out.println("Akar dengan Algoritma Divide Conquer: " + hasilDivideConquer);

        sc.close();
    }
}
