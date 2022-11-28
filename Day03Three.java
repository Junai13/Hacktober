import java.util.Scanner;

public class Day03Three {
    public static void main(String[] args) {
        Day03Three three = new Day03Three();
        three.reverse();
    }
    private void reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        int reverseNumber =0;
        while (number>0){
            int n = number%10;
            reverseNumber = (reverseNumber + n) *10;
            number =number/10;
        }
        System.out.println(reverseNumber/10);
    }
}
