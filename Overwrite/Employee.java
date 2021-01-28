package Overwrite;

public class Employee {
    private String name;
    private String address;
    private int number;
    public Employee(String myName, String myAddress, int myNumber){
        System.out.println("Employee "+myName+" is created");
        this.name = myName;
        this.address = myAddress;
        this.number = myNumber;
    }
    public void mailCheck(){
        System.out.println("send a check by mail to No." + this.number + " " + this.name + ": " + this.address);
    }
    public String toString(){
        return "No." + this.number + " " + this.name + ": " + this.address;
    }
}
