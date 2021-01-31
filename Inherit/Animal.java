package inherit;

public class Animal {
    private String name;
    private int id;
    public Animal(String myName, int myId){
        this.name = myName;
        this.id = myId;
    }
    public void eat(){
        System.out.println(name + ": 正在进食");
    }
    public void sleep(){
        System.out.println(name + ": 正在睡觉");
    }
    public void introduction(){
        System.out.println("大家好我"+id+"号动物"+name);
    }
}
