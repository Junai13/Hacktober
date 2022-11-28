import java.util.Scanner;

public class Day10Ten {
    public static void main(String[] args) {
        Day10Ten ten = new Day10Ten();
        ten.process();
    }
    private void process(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        sc.close();
        int len = input.length();
        int mid = len/2+1;
        String output ="";
        for(int i=0;i<len;i++){
            for(int j=0;j<mid;j++)
                output += input.charAt(i);
            if(i<mid)
                mid--;
            else mid++;
        }
        System.out.println(output);
    }
}
