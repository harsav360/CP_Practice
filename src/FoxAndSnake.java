import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] inputParts = inputLine.split(" ");
        int row = Integer.parseInt(inputParts[0]);
        int col = Integer.parseInt(inputParts[1]);
        int flag = 0;
        for(int i = 1;i<=row;i++){
            // If Odd
            if(i%2 == 1) {
                for (int j = 0; j < col; j++) {
                    System.out.print('#');
                }
            } else {


                // If Even
                if (flag == 0) {
                    for (int j = 0; j < col; j++) {
                        if (j == col - 1) {
                            System.out.print('#');
                        } else {
                            System.out.print('.');
                        }
                        flag = 1;
                    }
                } else {
                    for (int j = 0; j < col; j++) {
                        if (j == 0) {
                            System.out.print('#');
                        } else {
                            System.out.print('.');
                        }
                        flag = 0;
                    }
                }
            }
            System.out.println();
        }
    }
}
