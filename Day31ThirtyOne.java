import java.util.Random;
import java.util.Scanner;

public class Day31ThirtyOne {
    public static void main(String[] args) {
        Day31ThirtyOne thirtyOne = new Day31ThirtyOne();
        thirtyOne.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row = sc.nextInt();
        System.out.println("Enter the colum: ");
        int col = sc.nextInt();
        sc.close();
        char[][] sweeper = new char[row][col];
        Random random = new Random();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sweeper[i][j]= random.nextInt(2)=='\u0000' ? '0':'M';
                System.out.print(sweeper[i][j] +" ");
            }
            System.out.println();
        }
        mineSweeper(sweeper,row,col);
    }
    private void mineSweeper(char[][] sweeper,int row, int col){
        System.out.println("\n\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(sweeper[i][j]!='M')
                    sweeper[i][j] = getCount(sweeper, i, j, row, col);
                System.out.print(sweeper[i][j] + " ");
            }
            System.out.println();
        }
    }
    private char getCount(char[][] sweeper, int currentRow, int currentColumn, int row, int col) {
        int count = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (currentRow + i >= 0 & currentRow + i < row & currentColumn + j >= 0 & currentColumn + j < col) {
                    if (sweeper[currentRow + i][currentColumn + j] == 'M')
                        count++;
                }
            }
        }
        return (char) (count + '0');
    }
}
