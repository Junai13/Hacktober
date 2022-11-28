import java.util.Scanner;

public class Day11Eleven {
    public static void main(String[] args) {
        Day11Eleven eleven = new Day11Eleven();
        eleven.process();
    }
    private void process(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        sc.close();
        String output="";
        int len = input.length();
        for(int i=0;i<len;i++){
            output += input.charAt(i);
            System.out.print(output+" ");
        }
    }
}
