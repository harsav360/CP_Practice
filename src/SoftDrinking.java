import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] inputParts = inputLine.split(" ");
        int n = Integer.parseInt(inputParts[0]); // friends
        int k = Integer.parseInt(inputParts[1]); // bottles
        int l = Integer.parseInt(inputParts[2]); // liters
        int c = Integer.parseInt(inputParts[3]); //limes
        int d = Integer.parseInt(inputParts[4]); // slices of lime
        int p = Integer.parseInt(inputParts[5]); //salt
        int nl = Integer.parseInt(inputParts[6]); // need for one drink
        int np = Integer.parseInt(inputParts[7]); // need for one drink

        // nl milliliters of the drink, a slice of lime and np grams of salt
        int totalSlices = c*d;
        int totalLiter = k*l;
        int needOfAlc = (int)Math.floor(totalLiter/nl);
        int needOfSalt  = (int)Math.floor((p/np));
        System.out.println((int)(Math.min(needOfAlc,Math.min(needOfSalt,totalSlices))/n));






    }
}
