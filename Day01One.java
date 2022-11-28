import java.util.Scanner;

public class Day01One {
    public static void main(String[] args) {
        Day01One one = new Day01One();
        one.frequency();;
    }
    private void frequency(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        long number = sc.nextLong();
        System.out.println("enter the number to find frequency");
        byte search = sc.nextByte();
        int count=0;
        while(number>0){
           if(number%10 == search)
                count++;
           number = number/10;
        }
        System.out.println(count);
    }
}
