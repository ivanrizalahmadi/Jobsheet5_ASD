public class Akarbilangan13 {

    public static int bruteForceSqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int result = 1;
        while (result * result <= x) {
            result++;
        }
        return result - 1;
    }

    public static int divideConquerSqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        return divideConquerBantu(x, 0, x);
    }

    private static int divideConquerBantu(int x, int kiri, int kanan) {
        if (kiri <= kanan) {
            int tengah = kiri + (kanan - kiri) / 2;
            int tengahKuadrat = tengah * tengah;
            if (tengahKuadrat == x) {
                return tengah;
            } else if (tengahKuadrat < x) {
                return divideConquerBantu(x, tengah + 1, kanan);
            } else {
                return divideConquerBantu(x, kiri, tengah - 1);
            }
        }
        return kanan;
    }
}
