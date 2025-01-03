import java.util.Scanner;

public class ChewbNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long answer = 0;
        int power = 0;

        while (number > 0) {
            int digit = (int) (number % 10);
            int invDigit = 9 - digit;

            if (number < 10 && digit == 9) {
                answer += digit * (long) Math.pow(10, power);
            } else if (invDigit < digit) {
                answer += invDigit * (long) Math.pow(10, power);
            } else {
                answer += digit * (long) Math.pow(10, power);
            }

            power++;
            number /= 10;
        }

        System.out.println(answer);
    }
}
