package PropertiMetode;

public class Main {
    public static void main(String[] args) {
        //Kita tambahkan 1 argumen dengan nilai int 2
        //NIlai tersebut adalah nilai yang digunakan untuk variable umur
        Hewan kucing = new Hewan(2);
        kucing.makan();
        kucing.jalan();
        kucing.lari();

        //Contoh penggunaan fungsi get umur
        System.out.println("Umurnya adalah " + kucing.getUmur());

        //Perhitungan indeks massa tubuh (BMI)
        //Berat (kg) / ( tinggi (m) * tinggi (m) )
        double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));
        System.out.println("Indeks massa tubuhnya adalah " + bmi);

    }
}
