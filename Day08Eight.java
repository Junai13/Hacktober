import java.util.Scanner;

public class Day08Eight {
    public static void main(String[] args) {
        Day08Eight eight = new Day08Eight();
        eight.getInput();
    }
    private void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String str = scan.nextLine();
        scan.close();
        String[] numbers = str.split(";");
        long result =0;
        for(String num:numbers)
            result += Integer.parseInt(num);
        System.out.println(result);
    }
}
