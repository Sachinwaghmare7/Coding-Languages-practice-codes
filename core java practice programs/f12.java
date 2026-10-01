class f12 {
    int i = 10;
    {
        m1();
        System.out.println("first instance block ");
    }
    f12(){
        System.out.println("constructor");
    }
    public static void main(String[] args){
//        f12 t = new f12();
        System.out.println("main");
    }
     public void m1()
     {
         System.out.println(j);
     }
    {
        System.out.println("second instatce variable");
    }
    int j = 20;
}
