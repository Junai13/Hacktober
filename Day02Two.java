import java.util.Scanner;

public class Day02Two {
    public static void main(String[] args) {
        Day02Two two = new Day02Two();
        two.sum();
    }
    private void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int lastDigit = number%10;
        while(number>=10)
            number /= 10;
        int firstDigit = number;
        System.out.println(firstDigit+lastDigit);
        sc.close();
    }
}
