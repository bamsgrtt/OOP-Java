package AccessModifier.package1;

public class PrivateStatement {

    private int memberA = 5;

    //Default modifier berarti penulisan kodenya tanpa atribut modifier. Ini berlaku untuk semua kelas, member, atau fungsi yang kita tuliskan tanpa access modifier.
    //
    //Modifier default bisa diakses selama masih dalam satu package.
    char memberB = 'A';
    double memberC = 1.5;

    // Menggunakan Private
    private int functionA(){
        return memberA;
    }

    int functionB (){
        // pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }

    protected void methodC(){
        System.out.println("Percobaan Access Modifier");
    }
}
