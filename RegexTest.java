import java.util.regex.*;
public class RegexTest {
    public static void main(String[] args){
        // String pattern = ".*hello.*";
        // String content = "ah hello world";
        // boolean isMatch = Pattern.matches(pattern, content);
        // System.out.println("字符串中包含了样式串吗? " + isMatch);
        String line = "My computer uses H61, OK>>";
        String pattern = "(\\D*)(\\d+)(.*)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if(m.find()){
            System.out.println("Found value: "+m.group(0));
            System.out.println("Found value: "+m.group(1));
            System.out.println("Found value: "+m.group(2));
            System.out.println("Found value: "+m.group(3));
        }
    }
}
