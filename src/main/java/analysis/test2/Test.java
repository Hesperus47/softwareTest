package analysis.test2;

import analysis.test2.MyDirectory;
import analysis.test2.MyFile;

public class Test {
    public static void main(String[] args) {
        MyDirectory a1 = new MyDirectory("a1");
        MyDirectory b1 = new MyDirectory("b1");
        MyDirectory b2 = new MyDirectory("b2");
        a1.add(b1);
        a1.add(b2);

        MyDirectory a2 = new MyDirectory("a2");
        MyDirectory c1 = new MyDirectory("c1");
        a2.add(c1);

        MyFile java = new MyFile("test1.java", 100);
        MyFile python = new MyFile("test2.python", 214);
        c1.add(java);
        c1.add(python);
    }
}
