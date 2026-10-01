//abstract class e4 {
//    String name;
//    int age;
//
//}
//class stu extends e4{
//    int rollNo;
//    int marks;
//    stu(String name,int age, int rollNo , int marks){
//        this.name= name;
//        this.age= age;
//        this.rollNo= rollNo;
//        this.marks = marks;
//    }
//}
//class tech extends e4{
//    double salary ;
//    String subject;
//    tech(String name,int age, double salary,String subject){
//        this.name = name;
//        this.age= age;
//        this.salary= salary;
//        this.subject= subject;
//
//    }
//}
//// this abhove code will be increases code of lines  ////




abstract class e4{
    String name;
    int age;

    e4( String name,int age){
        this.name= name;
        this.age= age;
    }
}
class boy extends e4{
    int rollNO;
    int marks;
    boy(String name, int age, int rollNo,int marks){
        super(name, age);
        this.rollNO= rollNo;
        this.marks = marks;

    }

}
//boy b = new boy ("sachin", 20,07,74);

class te extends e4{
    double salary ;
    String subject;
    te(String name, int age, int salary,String subject){
        super(name, age);
        this.salary= salary;
        this.subject= subject;


    }

}


/// above code will be decreases line of code and increases reusablity ///