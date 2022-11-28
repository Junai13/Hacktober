import java.util.Scanner;

public class Day20Twenty {
    public static void main(String[] args) {
        Day20Twenty twenty = new Day20Twenty();
        twenty.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = sc.nextLine();
        System.out.println(process(string,1));
    }
    private boolean process(String s,int index){
        if(index==s.length())
            return false;
        if(s.charAt(index)==s.charAt(index-1))
            return true;
        return process(s,index+1);
    }
}
