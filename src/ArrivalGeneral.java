import java.util.Scanner;

public class ArrivalGeneral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String inputLine = scanner.nextLine();
        String[] inputParts = inputLine.split(" ");
        int[] soldiers = new int[n];
        for(int i = 0;i<inputParts.length;i++){
            soldiers[i] = Integer.parseInt(inputParts[i]);
        }
        int miniValue = 101;
        int maxValue = 0;
        int miniIndex = 0;
        int maxIndex = 0;
        for(int i = 0;i<soldiers.length;i++){
            if(maxValue < soldiers[i]){
                maxValue = soldiers[i];
                maxIndex = i;
            }
            if (miniValue >= soldiers[i]){
                    miniValue = soldiers[i];
                    miniIndex = i;
            }
        }
        if (maxIndex > miniIndex){
            System.out.println(maxIndex + n-miniIndex-2);
        }
        else {
            System.out.println(maxIndex + n-miniIndex-1);
        }
    }
}
