import java.util.Scanner;

public class BitPP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        while (n > 0) {
            String exp = scanner.next();
            if (exp.charAt(0)== '-' || exp.charAt( 2) == '-'){
                result -= 1;
            } else {
                result += 1;
            }
            n -= 1;
        }
        System.out.println(result);
    }
}
