import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
 
public class Main {
    public static void main(String[] args) throws IOException {
        int a, b, c, m;
        Scanner input = new Scanner(System.in);
        
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        // maior entre a e b
        m = ((a + b) + Math.abs(a - b)) / 2;
        // maior entre maior anterior e c
        m = ((m + c) + Math.abs(m - c)) / 2;
        
        System.out.printf("%d eh o maior\n", m);
    }
}
