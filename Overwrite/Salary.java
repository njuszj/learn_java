package Overwrite;

public class Salary extends Employee{
    private double salary;
    public Salary(String myName, String myAddress, int myNumber, double mySalary){
        super(myName, myAddress, myNumber);
        setSalary(mySalary);
    }
    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary = newSalary;
        }
    }
}
