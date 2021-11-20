package come.testing.class10;

/**
 * @Classname Animal
 * @Description 类型说明
 * @Date 2021/8/26 21:00
 * @Created by 特斯汀Roy
 */
public class Animal {
    public int age;
    public String name;
    public String kind="动物";


    public Animal(String name){
        this.name=name;
        System.out.println("有参的构造方法有名字" + name + "的动物出生了");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move(){
        System.out.println("狗子绳子都拴不住");
    }

    public void eat(){
        System.out.println("动物都要吃饭，不然就饿死了");
    }

    public String toString(){

        return "这是一个动物"+super.toString();
    }

}
