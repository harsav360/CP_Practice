import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfRoundNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0){
            int number = scanner.nextInt();
            int pow = 1;
            List<Integer> ans = new ArrayList<>();
            while (number > 0){
                if (number%10 > 0){
                    ans.add((number%10)*pow);
                }
                number /= 10;
                pow *= 10;
            }
            System.out.println(ans.size());
            for(Integer num:ans) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
