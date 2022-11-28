import java.util.Scanner;

public class Day16Sixteen {
    public static void main(String[] args) {
        Day16Sixteen sixteen = new Day16Sixteen();
        sixteen.rangoli();
    }

    /*for i in range(n-1,-1,-1):
      for j in range(i):
         print(end="--")
      for j in range(n-1,i,-1):
         print(chr(j+97),end="-")
      for j in range(i,n):
         if j != n-1:
            print(chr(j+97),end="-")
         else:
            print(chr(j+97),end="")
      for j in range(2*i):
         print(end="-")
      print()
   for i in range(1,n):
      for j in range(i):
         print(end="--")
      for j in range(n-1,i,-1):
         print(chr(j+97),end="-")
      for j in range(i,n):
         if j != n-1:
            print(chr(j+97),end="-")
         else:
            print(chr(j+97),end="")
      for j in range(2*i):
         print(end="-")
   print()
*/
    private void rangoli(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N: ");
        int n = sc.nextInt();
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                System.out.print("-");
            }
            for(int j =n-1;j>i;j--){
                System.out.print((char) (j+97) + "-");
            }
            for(int j=i;j<n;j++){
                if(j!=n-1){
                    System.out.print((char) (j+97)+"-");
                }else
                    System.out.print((char)(j+97)+"");
            }
            for (int j=0;j<2*i;j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
