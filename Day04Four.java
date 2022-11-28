import java.util.Scanner;

public class Day04Four {
    public static void main(String[] args) {
        Day04Four four = new Day04Four();
        four.seccondMaximum();
    }
    private void seccondMaximum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int number1 =sc.nextInt();
        int number2 =sc.nextInt();
        int number3 =sc.nextInt();
        if(number1>=number2 && number1<=number3 || number1<=number2 && number1>=number3)
            System.out.println("Second maximum nuber is "+ number1);
        else if ((number2 >= number1 && number2 <= number3) || (number2 <= number1 && number2 >= number3)) {
            System.out.println("Second maximum nuber is "+ number2);
        } else if ((number3 >= number1 && number3 <= number2) || (number3 <= number1 && number3 >= number2)) {
            System.out.println("Second maximum nuber is "+ number3);
        }
    }
}
