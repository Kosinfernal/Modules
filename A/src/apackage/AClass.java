package apackage;

public class AClass {
    public static void print(String str){
        System.out.println(str);
    }
    // Determine if a is a factor of b.
    public static boolean isFactor(int a, int b) {
        if((b%a) == 0) return true;
        return false;
    }
}
