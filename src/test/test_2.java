package test;

public class test_2 {
    private int i;

    public static void main(String[] args) {
        test_2 r = new test_2();
        r.amethod(r);
        toString(r);
    }

    private static void toString(test_2 r) {
    }

    public void amethod(test_2 r) {
        int i = 99;
        multi(r);
        System.out.println(i);
    }

    public void multi(test_2 r) {
        r.i = r.i * 2;
        System.out.println();
    }

    public String toString() {
        String age = "10";
        String name = "薛佳豪";
        return "大家好！我是新来的员工，我叫" + name + "，今年" + age + "岁。";
    }
}
