package AccessModifier.package1;

public class Main {
    public static void main(String[] args) {
        // ini untuk memanggil class private
        PrivateStatement privateStatement = new PrivateStatement();

        System.out.println(privateStatement.functionB());

        //output dari Modifier Deffault
        System.out.println(privateStatement.memberB);
        System.out.println(privateStatement.memberC);

    }
}
