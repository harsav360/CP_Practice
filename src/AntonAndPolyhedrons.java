import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        scanner.nextLine();
        long ans = 0;
        Map<String,Integer> polyhed = new HashMap<>();
        polyhed.put("Tetrahedron",4);
        polyhed.put("Cube",6);
        polyhed.put("Octahedron",8);
        polyhed.put("Dodecahedron",12);
        polyhed.put("Icosahedron",20);
        while (n-- > 0){
            String shape = scanner.nextLine();
            ans += polyhed.get(shape);
        }
        System.out.println(ans);
    }
}
