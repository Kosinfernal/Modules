package cpackage;

import apackage.AClass;
import bpackage.BClass;

public class CClass {
    public static void main(String[] args) {
        AClass.print("hello");

        BClass.calculate(1,2);

        // Now, isFactor() is referred to via AClass,
        // not SimpleMathFuncs.
        if(AClass.isFactor(2, 10))
            System.out.println("2 is a factor of 10");

        System.out.println("Smallest factor common to both 35 and 105 is " +
                BClass.lcf(35, 105));

        System.out.println("Largest factor common to both 35 and 105 is " +
                BClass.gcf(35, 105));
    }
}
