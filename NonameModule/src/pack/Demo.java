package pack;

import SimpleMathFuncs.SimpleMathFuncs;
//при компиляции используется -classpath
public class Demo {
    public static void main(String[] args) {
        SimpleMathFuncs smf = new SimpleMathFuncs();
        SimpleMathFuncs.isFactor(50, 500);
        smf.hashCode();
    }
}
