package AccessModifier.package3;

public class Main {
    public static void main(String[] args) {
        // Static Variable
        System.out.println("Nilainya adalah " + Perhitungan.nilai);
        // Memanggil dari kelas lain

        //kemudian test dengan for
        for (int x = 0; x < 5 ;x++ ){
            new Perhitungan();
        }


        System.out.println("Sampai " + Perhitungan.nilai);
        System.out.println("GetNIlai memiliki nilai " + Perhitungan.getNilai());
    }


}
