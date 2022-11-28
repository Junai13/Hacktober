import java.util.Scanner;

public class Day26TwentySix {
    public static void main(String[] args) {
        Day26TwentySix twentySix = new Day26TwentySix();
        twentySix.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary String: ");
        String str = sc.next();
        String ouput ="";
        System.out.println(bitFlip(str,ouput,0));;
    }
    private String bitFlip(String s,String output,int index){
       if(s.length()==index)
           return output;
       output += (s.charAt(index)=='0' ? '1':'0');
       return bitFlip(s,output,index+1);
    }
}
