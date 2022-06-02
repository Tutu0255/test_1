package test;

class Person
{
    public int age;             //声明公共字段age

    private String name;        //声明私有字段name
    public int getAge() {//实现age成员的Getter方法
        return age;
    }
    public String getName() {//实现name成员的Getter方法

        return name;
    }
    public void eat()           //定义无参数的eat方法
    {
        System.out.println("会生活");
    }
    public void work(String s)   //定义带参数的work方法
    {
        System.out.println("努力创造"+s);
    }
    public Person(int age, String name) //定义一个带参数构造函数
    {
        this.age = age;
        this.name = name;
    }
}
