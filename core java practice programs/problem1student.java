import java.util.Scanner;
public class problem1student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter student name");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("enter your first subjet marks:");
        int no1 = sc.nextInt();
        System.out.println("enter your second subject marks:");
        int no2 = sc.nextInt();
        System.out.println("enter your third subject marks:");
        int no3 = sc.nextInt();
        System.out.println("enter your fourth subject marks:");
        int no4 = sc.nextInt();
        System.out.println("enter your fifth subject marks:");
        int no5 = sc.nextInt();
        int sum = no1 + no2 + no3 + no4 + no5;

        System.out.println("enter first subject marks:" +no1 + " out of 100");
        System.out.println("enter second subject marks:"+no2 + " out of 100");
        System.out.println("enter third subject marks:" +no3 + " out of 100");
        System.out.println("enter fourth subject marks:"+no4 + " out of 100");
        System.out.println("enter fifth subject marks:" +no5 + " out of 100");
        System.out.println("total marks gained: "+ sum +" out of 500");
        float per =(float) sum/5;
        System.out.println("percentage:"+ per);
    }
}
