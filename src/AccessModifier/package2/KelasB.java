package AccessModifier.package2;

import AccessModifier.package1.PrivateStatement;

public class KelasB extends PrivateStatement{

    @Override
    protected void methodC(){
        super.methodC();

        System.out.println("contoh pemanggilan protected dari package luar");
    }

}
