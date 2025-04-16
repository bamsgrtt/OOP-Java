package PropertiMetode;

public class Hewan {

    // Properti atau Fields
    // inisiasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;

    //inisiasi melalui konstruktor
    int umur;

    //konstruktor dengan parameter
    Hewan(int umur) {
        this.umur = umur;

    }
    void lari() {
        System.out.println("Berlari dengan sangat cepat..");
    }

    void jalan (){
        System.out.println("Berjalan dengan pelan..");
    }

    void makan (){
        System.out.println("Makan dengan menggunakan mulut..");
    }

    double getTinggi(){
        return tinggi;
    }
    double getBerat(){
        return berat;
    }

    int getUmur(){
        return umur;
    }
}
