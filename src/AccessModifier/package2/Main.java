package AccessModifier.package2;

import AccessModifier.package1.PrivateStatement;

public class Main {
    public static void main(String[] args) {
        // ini pasti akan mengalami kompiler error

        PrivateStatement privateStatement = new PrivateStatement();

        //System.out.println(privateStatement.functionB());
        //System.out.println(privateStatement.memberB);
        //System.out.println(privateStatement.memberC);

        KelasB kelasB = new KelasB();
        kelasB.methodC();

    }
}
