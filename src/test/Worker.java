package test;

public class Worker {
    public String name;    // 姓名
    private int age;    // 年龄
    // 定义带有一个参数的构造方法
    public static void main(String[] args) {
        Worker w = new Worker();
//        w.toString("薛佳豪",210);
    }

    public Worker(String name) {
        this.name = name;
    }
    // 定义带有两个参数的构造方法
    public Worker(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Worker() {
        System.out.println("这是构造方法");
    }

    public void toString(String name, int age) {
        System.out.println("大家好！我是新来的员工，我叫"+name+"，今年"+age+"岁。");

    }


}
