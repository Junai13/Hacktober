import java.util.Scanner;

public class Day05Five {
    public static void main(String[] args) {
        Day05Five five = new Day05Five();
        five.triangle();
    }
    private void triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angles");
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean result = a + b + c == 180;
        System.out.println(result);
    }
}
