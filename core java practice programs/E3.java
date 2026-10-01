class t{
    t(){
        System.out.println(this.hashCode());
    }
}
class m extends t {
    m(){
        System.out.println(this.hashCode());
    }
}
public class E3 {
    public static void main(String[]args){
        c c = new c();
        System.out.println(c.hashCode());
    }
}
