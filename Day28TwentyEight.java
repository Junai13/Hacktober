import java.util.ArrayList;
import java.util.Scanner;

public class Day28TwentyEight {
    public static void main(String[] args) {
        Day28TwentyEight twentyEight = new Day28TwentyEight();
        twentyEight.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++)
            list.add(sc.nextInt());
        sc.close();
        System.out.println(process(list,0));
    }
    private boolean process(ArrayList<Integer> list,int index){
        if(list.size()==index)
            return false;
        if(list.get(index)==-(list.get(index+1)))
            return true;
        return process(list,index+1);
    }
}
