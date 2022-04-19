package MyModAppDemo;
// Demonstrate a simple module-based application.
//класс безымянного модуля

import SimpleMathFuncs.SimpleMathFuncs;

public class MyModAppDemo {
    public static void main(String[] args) {

        if(SimpleMathFuncs.isFactor(2, 10))
            System.out.println("2 делитель 10");

        System.out.println("Наименьший делитель 35 и 105 это " +
                SimpleMathFuncs.lcf(35, 105));

        System.out.println("Наибольший делитель 35 и 105 это " +
                SimpleMathFuncs.gcf(35, 105));
    }
}
