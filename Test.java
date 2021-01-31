import static lib.njuszj.util.Print.*;
public class Test {
    static final int VAL = 10;
    public static final int BOXWIDTH = 6;
    public static void f(Character...args){
        System.out.println(args.getClass());
        System.out.println(args.length);
    }
    public static void main(String[] args){
       print("Print function is aviliable now.");
       printf("Hello, Mr.%d", 7);
    }
}
