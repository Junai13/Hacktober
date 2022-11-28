import java.util.ArrayList;
import java.util.Collections;
public class Day14Fourteen {
    public static void main(String[] args) {
        Day14Fourteen fourteen = new Day14Fourteen();
        fourteen.rotate();
        fourteen.rotateArray();

    }

    private void rotate(){
        // USING IN BUILD METHOD
        ArrayList<Character> arraylist = new ArrayList<>();
        for(char c='a';c<='z';c++){
            arraylist.add(c);
            System.out.print(c);
        }
        System.out.println();
        for(int i =1;i<26;i++){
                Collections.rotate(arraylist, -1);
                for(int j=0;j<26;j++) {
                    System.out.print(arraylist.get(j));
                }
            System.out.println();
        }
    }
    private void rotateArray() {
        // USING 2D ARRAY
        char[][] arr = new char[26][26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                int alpha = i + j;
                if (alpha >= 26)
                    alpha = alpha - 26;
                alpha = alpha + 97;
                arr[i][j] = (char) alpha;
            }
        }
        for(int i =0;i<26;i++){
            for(int j =0;j<26;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
