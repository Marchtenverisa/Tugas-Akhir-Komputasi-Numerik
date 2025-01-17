package uaskomputasinumerik;

public class Uaskomputasinumerik2 {

    public static double fungsiF(double x) {
        return x * x + 1;
    }

    public static double fungsiG(double x) {
        return 2 * x;
    }

    public static double hitungLuas(double a, double b, int n, Fungsi f, Fungsi g) {
        double h = (b - a) / n;
        double luas = 0.0;

        for (int i = 0; i < n; i++) {
            double x1 = a + i * h;
            double x2 = a + (i + 1) * h;
            luas += 0.5 * h * (f.hitung(x1) + f.hitung(x2) - g.hitung(x1) - g.hitung(x2));
        }

        return luas;
    }

    public static void main(String[] args) { // Here's the corrected main method
        double a = 0;
        double b = 2;
        int n = 1000; // Jumlah subinterval

        Fungsi fungsiF = x -> x * x + 1;
        Fungsi fungsiG = x -> 2 * x;

        double luas = hitungLuas(a, b, n, fungsiF, fungsiG);
        System.out.println("Luas daerah: " + luas);
    }

    interface Fungsi {
        double hitung(double x);
    }
}