package AccessModifier.package3;

public class Perhitungan {
    public static int nilai = 0;

    //Static Method
    protected static int getNilai(){
        return nilai;
    }


    //menambahkan Konstruktor
    Perhitungan() {
        nilai++;
    }
}
