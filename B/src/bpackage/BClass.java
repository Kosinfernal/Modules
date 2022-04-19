package bpackage;

import apackage.AClass;

public class BClass {

    public static void calculate(int a, int b) {
        int i = a + b;
        System.out.println(i);
        AClass.print("from A");
    }
    // Return the smallest positive factor that a and b have in common.
    public static int lcf(int a, int b) {
        // Factor using positive values.
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;

        for(int i = 2; i <= min/2; i++) {
            if(AClass.isFactor(i, a) && AClass.isFactor(i, b))
                return i;
        }
        return 1;
    }

    // Return the largest positive factor that a and b have in common.
    public static int gcf(int a, int b) {
        // Factor using positive values.
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;

        for(int i = min/2; i >= 2; i--) {
            if(AClass.isFactor(i, a) && AClass.isFactor(i, b))
                return i;
        }
        return 1;
    }
}
