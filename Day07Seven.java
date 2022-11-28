import java.util.Scanner;

public class Day07Seven {
    public static void main(String[] args) {
        Day07Seven seven = new Day07Seven();
        seven.getInput();
    }
    private void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year to be check: ");
        int year = scan.nextInt();
        scan.close();
        System.out.println("is "+year+"  leap year?: "+isLeapYear(year));
    }
    private boolean isLeapYear(int year){
        if( year % 4 != 0 ) return false;
        if(  year % 100 == 0 && year % 400 != 0 ) return false;
        return true;
    }
}
