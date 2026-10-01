class f14 {
    String name;
    int rollNo;

    f14(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;

    }

    public static void main(String[] args) {

        f14 s1 = new f14("durga", 101);
        f14 s2 = new f14("sachin", 102);
        System.out.println(s1.name+ "\n"+ s2.rollNo);


    }
}

