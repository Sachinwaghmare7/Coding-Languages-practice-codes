//class f11 {
//    public static void main(String [] args){
//        System.out.println("shankar");
//    }
//        }

class f11{
    static int i =10;
    static {
        m1();
        System.out.println("base static block");

    }
    public static void main(String[] args){
        m1();
        System.out.println("base main");
    }
    public static void m1(){
        System.out.println(j);
    }
    static int j = 20;
        }

class derived extends f11{
    static int x = 100;
    static {
        m2();
        System.out.println("derivrd ststic first block");
    }
    public static void main(String [] args){
        m2();
        System.out.println("derived main");

    }
    public static void m2(){
        System.out.println(y);
    }
    static{
        System.out.println("derived static second block ");
    }
    static int y = 30 ;
}