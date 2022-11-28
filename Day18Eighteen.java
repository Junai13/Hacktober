import java.util.Scanner;

public class Day18Eighteen {
    public static void main(String[] args) {
        Day18Eighteen eighteen = new Day18Eighteen();
        eighteen.hashPattern();
    }
    private void hashPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++ ) {
            for (int j = 1 ; j <= n; j++ ){
                if (i == 1 || i == n || i == j || j == 1 || j == n || j == n - i + 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
