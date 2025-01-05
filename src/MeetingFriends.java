import java.util.Scanner;

public class MeetingFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] inputParts = inputLine.split(" ");
        int x1 = Integer.parseInt(inputParts[0]);
        int x2 = Integer.parseInt(inputParts[1]);
        int x3 = Integer.parseInt(inputParts[2]);
        System.out.println((Math.abs(x1-x2)+Math.abs(x2-x3)+Math.abs(x1-x3))/2);
    }
}
