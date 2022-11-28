import java.util.Scanner;

public class Day23TwentyThree {
    public static void main(String[] args) {
        Day23TwentyThree twentyThree = new Day23TwentyThree();
        twentyThree.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        System.out.println(process(str,0));
    }
    private boolean process(String s,int index){
        if(s.length()==index)
            return true;
        if(s.charAt(index)!='1'&&s.charAt(index)!='0')
            return false;
        return process(s,index+1);
    }
}
