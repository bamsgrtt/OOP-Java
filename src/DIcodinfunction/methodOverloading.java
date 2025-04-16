package DIcodinfunction;

public class methodOverloading {
    public static void main(String[] args) {
        double p  = 7;
        double l = 6.5;
        double hasil = hitungLuas(p,l);
        System.out.println("Hasil method double adalah = " + hasil);

        int pn = 7;
        int ln = 6;
        int hsl = hitungLuas(pn,ln);
        System.out.println("Hasil method integer adalah = " + hsl);
    }

    public static double hitungLuas(double panjang , double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

    public static int hitungLuas(int panjang , int lebar) {
        int luas = panjang* lebar;
        return luas;
    }

}
