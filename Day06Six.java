import java.util.Scanner;

public class Day06Six {
    public static void main(String[] args) {
        Day06Six six = new Day06Six();
        six.process();
    }
    private  void process(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = scan.nextLine();
        String[] words = sentence.split(" ");
        String output="";
        for(String s:words){
            char c = s.charAt(0);
            c += ('A'-'a');
            output += c+s.substring(1)+" ";
        }
        System.out.println(output);
        scan.close();
    }
}
