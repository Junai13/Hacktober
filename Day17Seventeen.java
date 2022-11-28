import java.util.Scanner;

public class Day17Seventeen {
    public static void main(String[] args) {
        Day17Seventeen seventeen = new Day17Seventeen();
        seventeen.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int x = 1;
        for (int i = 0; i < size; i++) {
            if (size % 2 == 0 && i != 0) {
                x = x == 1 ? 2 : 1;
            }
            for (int j = 0; j < size; j++) {
                System.out.print(x);
                x = x == 1 ? 2 : 1;
            }
            System.out.println();
        }
        sc.close();
    }
}
