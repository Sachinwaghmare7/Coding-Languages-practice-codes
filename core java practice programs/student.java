public class student {
    String name;
    int rollNo;
    int marks;
    static String collegeName;
   String getStudentInfo(){
        return name + ".... " + marks;
    }

        String getCollegeInfo(){
        return  collegeName;

        }
       int getAverage(int x, int y){
        return x+y / 2;
        }
        String grtCompleteInfo(){
        return name + "...." + rollNo + "....."+ marks +"....."+ collegeName;
        }


}
