import java.util.Scanner;

public class Day27TwentySeven {
    public static void main(String[] args) {
        Day27TwentySeven twentySeven = new Day27TwentySeven();
        twentySeven.getInput();
    }
    private void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        printPattern(n - 1);
    }
    private void printPattern(int n) {
        int[][] matrix = new int[n][n];
        int value;
        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <len; j++) {
                if (i == 0)
                    matrix[i][j] = (j + 1);
                else if (j == 0)
                    matrix[i][j] = (i + 1);
                else if (i == len - 1)
                    matrix[i][j] = (matrix[i][j - 1] - 1);
                else if (j == len - 1)
                    matrix[i][j] = (matrix[i - 1][j] - 1);
                else {
                    value = matrix[i][j-1]+(i+1);
                    if(value<=n)
                        matrix[i][j] = value;
                    else
                        matrix[i][j] = value-n-1;
                }

            }
        }
        System.out.println();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
