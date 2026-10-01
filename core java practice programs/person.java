public class person {
    String name ;
    int age;
    person (String name ,int age ){
        this.name= name;
        this.age= age;

    }
}
class student extends person{
    int rollNo;
    int marks;
    student (String name , int age , int rollNo, int marks)
    {
        super(name,age);
        this.rollNo= rollNo;
        this.marks = marks;
    }
}
