//public class c5 {
//    public static void main(String[] args){
//        int n = 5;
//        int m = 4;
//        for(int i = 1 ; i<=n;i++){
//            for(int j =1 ; j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println("*");
//
//        }
//    }
//}


// to print elements of one dimensional array// using for each loop
//public class c5{
//    public static void main(String[] args){
//        int[] x= {10,20,30,40};
//        for(int x1 : x){
//            System.out.println(x1);
//
//        }
//    }
//}


// to print element using normal for loop two dimensional array

//public class c5{
//    public static void main(String[] args){
//        int [][] x= {{10,20,30},{40,50}};
//        for(int i= 0 ; i < x.length;i++){
//            for(int j =0 ; j<x[i].length;j++){
//                System.out.println(x[i][j]);
//            }
//
//        }
//    }
//}


// to print elements using for each loop two dimensional array//

public class c5 {
    public static void main(String[] args) {
        int[][] x = {{10, 20, 30}, {40, 50, 60}} ;
            for (int[] x1 : x) {
                for (int x2 : x1) {
                    System.out.println(x2);
                }
            }
        }
    }

