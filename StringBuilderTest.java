public class StringBuilderTest {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder(10);
        sb.append("Hello");
        System.out.println(sb);
        sb.append(" ");
        sb.insert(6, "World");
        System.out.println(sb);
    }
}
