import java.util.Scanner;

public class Day09Nine {
    public static void main(String[] args) {
        Day09Nine nine = new Day09Nine();
        nine.process();
    }
    private void process(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = sc.next();
        int output =0;
        for(char c:word.toCharArray())
            output += c-'a'+1;
        System.out.println(output);
    }
}
