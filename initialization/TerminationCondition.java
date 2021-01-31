//: initialization/TerminationCondition.java
// Using finalize() to detect an object that hasn't been properly cleaned up

package initialization;

public class TerminationCondition {
    public static void main(String[] args){
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}

class Book{
    boolean checkedOut = false;
    Book(boolean checkout){
        checkedOut = checkout;
    }
    void checkIn(){
        checkedOut = false;
    }
    protected void finalize(){
        if(checkedOut){
            System.out.println("Error: checked out");
        }
    }
}