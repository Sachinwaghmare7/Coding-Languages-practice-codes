//public class test {
//    static int [] x;
//    public static void main(String[] args){
//        test t = new test();
//        System.out.println(t.x);
//        System.out.println(t.x[0]);
//    }
//}


//class test {
//    public static void m1(int... x){
//        System.out.println("var-arg method:" + x.length);
//
//    }
//    public static void main(String [] args){
//        m1();
//        m1(10);
//        m1(10,20);
//        m1(10,20,30,40);
//    }
//}


//class test {
//    public static void main(String[] args){
//        sum();
//        sum(10,20);
//        sum(10,20,30);
//        sum(10,20,30,40);
//
//    }
//    public static void sum(int...x){
//        int total = 0;
//        for( int x1 : x)
//        {
//             total = total + x1;
//        }
//        System.out.println("the sum :" + total);
//    }
//}


//  this code is invalid code note use in wtihtin two var- arg methods//
//class test {
//    public static void m1(int... x){
//        System.out.println("int...");
//    }
//    public static void m1(int[] x){
//        System.out.println("int[]");
//    }
//}


class testException extends RuntimeException {
    testException(String s){
        super(s);
    }


}
class testOldException extends RuntimeException {
    testOldException(String s){

        super(s);
    }
}
classCasteException{
    public static void main(String[] args) {
        int age = integer.parseInt(args[0]);
        if(age>60) {
            throw new textException ("please wait some more time ..you will get best match soon ");

        }
        else if(age <18) {
            throw new testOldException("your age is already crossed marriage age ..no chance of getting marrriage");
        }
        else {
            System.out.println("you will get match details soon by email");
        }
    }
}
