import java.util.Scanner;

public class Day22TwentyTwo {
    public static void main(String[] args) {
        Day22TwentyTwo twentyTwo = new Day22TwentyTwo();
        twentyTwo.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s= sc.next();
        System.out.println("Enter the second string: ");
        String t = sc.next();
        sc.close();
        System.out.println(process(s,t,0));
    }
    private int process(String s,String t,int index){
        if(s.equals(t))
            return -1;
        if(s.charAt(index)!=t.charAt(index))
            return index;
        return process(s,t,index+1);
    }
}