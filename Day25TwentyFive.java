import java.util.Scanner;

public class Day25TwentyFive {
    public static void main(String[] args) {
        Day25TwentyFive twentyFive = new Day25TwentyFive();
        twentyFive.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s = sc.next();
        System.out.println("Enter the second string: ");
        String t = sc.next();
        sc.close();
        System.out.println(oneAway(s,t,0,0));
    }
    private boolean oneAway(String s,String t,int count,int index){
        if(!(s.length() == t.length()) || count>1)
            return false;
        if(index==s.length())
            return true;
        if(s.charAt(index) != t.charAt(index))
            count++;
        return oneAway(s,t,count,index+1);
    }
}
