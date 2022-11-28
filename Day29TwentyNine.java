import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day29TwentyNine {
    public static void main(String[] args) {
        Day29TwentyNine twentyNine = new Day29TwentyNine();
        twentyNine.getInput();
    }
    private void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        System.out.println("Enter the elements of 1st array: ");
        for(int i=0;i<size;i++)
            list1.add(sc.nextInt());
        System.out.println("Enter the elements of the 2nd array: ");
        for(int i=0;i<size;i++)
            list2.add(sc.nextInt());
        Collections.sort(list1);Collections.sort(list2);
        System.out.println(process(list1,list2,0));
        sc.close();
    }
    private boolean process(List<Integer> list1,List<Integer> list2,int index){
        if(list1.size()==index)
            return true;
        if(list1.get(index) != list2.get(index))
            return false;
        return process(list1,list2,index+1);
    }
}
