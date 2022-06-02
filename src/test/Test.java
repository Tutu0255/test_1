package test;

public class Test {
    public static void main(String args[]) {
        ABC s = new ABC("Hello!","I love Java.");
        System.out.println(s.toString( ));
    }
}
class ABC {
    String s1;
    String s2;
    public ABC(String str1, String str2) {
        s1 = str1;
        s2 = str2;
    }
    public String toString() {
        return s1 + s2;
    }
}