import java.util.Scanner;

public class Day21TwentyOne {
    public static void main(String[] args) {
        Day21TwentyOne twentyOne = new Day21TwentyOne();
        twentyOne.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        System.out.println("Enter the character to be check: ");
        char ch = sc.next().charAt(0);
        System.out.println(process(str,ch,0));
    }
    private boolean process(String s,char ch,int index){
        if(index==s.length())
            return false;
        if(s.charAt(index)==ch)
            return true;
        return process(s,ch,index+1);
    }
}
