import java.io.*;

public class IoTest {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input character and quit with a 'q'");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while(c != 'q');
    }
}
