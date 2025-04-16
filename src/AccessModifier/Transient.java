package AccessModifier;

import java.io.Serializable;

public class Transient {

    class Test implements Serializable{

        //varible ini tidak akan dijaga nilainya
        transient int nilaiA;

        //variable ini akan dijaga nilai
        double nilaiB;
        String nilaiC;

    }
}
