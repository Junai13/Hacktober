import java.util.Scanner;

public class Day24TwentyFour {
    public static void main(String[] args) {
        Day24TwentyFour twentyFour = new Day24TwentyFour();
        twentyFour.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(process(num));
    }
    private int process(int num){
        if(String.valueOf(num).matches("[0-9]"))
            return num;
        return process(findSum(num,0));
    }
    private int findSum(int num,int sum){
        if(num==0)
            return sum;
        return findSum(num/10,sum+(num%10));
    }
}
