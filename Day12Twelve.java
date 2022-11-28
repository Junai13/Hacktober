import java.util.Scanner;

public class Day12Twelve {
    public static void main(String[] args) {
        Day12Twelve twelve = new Day12Twelve();
        twelve.process();
    }
    private void process(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        StringBuffer reverse = new StringBuffer(input);
        reverse.reverse();
        if(input.equalsIgnoreCase(String.valueOf(reverse)))
            System.out.println("Palidrome");
        else System.out.println("Not palindrome");
    }
}
