import java.util.Scanner;

class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("===================================================");
        System.out.println("\nHasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            long factorial = fk[i].faktorialBF(fk[i].nilai);
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + factorial);
        }
        System.out.println("===================================================");
        System.out.println("\nHasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            long factorial = fk[i].faktorialDC(fk[i].nilai);
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + factorial);
        }
        System.out.println("===================================================");
    }
}