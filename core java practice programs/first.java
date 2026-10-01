import java.util.Scanner;
public class first{
    public static void main(String args[]){

       int ans = sum();
System.out.println(ans);}
    static int sum(){
        Scanner sc = new Scanner(System.in);
        int firstNo= sc.nextInt();
        int secondNo = sc.nextInt();
      int sum= firstNo+secondNo;

      return sum;
//      System.out.println("welcome");
}
}
