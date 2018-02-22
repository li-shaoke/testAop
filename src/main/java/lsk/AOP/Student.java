package lsk.AOP;

/**
 * Created by lsk10238 on 2018/2/22.
 */
public class Student {
    private Integer age;
    private String name;
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        System.out.println("Age : " + age );
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        System.out.println("Name : " + name );
        return name;
    }
    public void printThrowException(){
        System.out.println("我只是简单试探下异常而已，呵呵呵。。。");
        throw new IllegalArgumentException();
    }
}
