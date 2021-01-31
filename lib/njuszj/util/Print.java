// njuszj 工具库
// 打印模块
package lib.njuszj.util;
import java.io.*;

public class Print {
    public static void print(Object obj){
        System.out.println(obj);
    }
    public static void print(){
        System.out.println();
    }
    public static void printnb(Object obj){
        System.out.print(obj);
    }
    public static PrintStream printf(String format, Object...args){
        return System.out.printf(format, args);
    }
}
