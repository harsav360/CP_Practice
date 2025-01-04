import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int rowPosition = -1, colPosition = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    rowPosition = i;
                    colPosition = j;
                }
            }
        }
        System.out.println(Math.abs(2-rowPosition) + Math.abs((2-colPosition)));
    }
}
