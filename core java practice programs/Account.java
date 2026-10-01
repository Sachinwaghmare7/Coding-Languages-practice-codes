import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {

    String Username = "sachin";
    transient String Password = "alone";

}

class serializeDemo {

    public static void main(String args[]) throws Exception {
        Account a1 = new Account();
        System.out.println(a1.Username + "..." + a1.Password);
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream Fis = new FileInputStream("abc.ser");
        ObjectInputStream Ois = new ObjectInputStream(Fis);
        Account a2 = (Account) Ois.readObject();
        System.out.println(a2.Username + "..." + a2.Password);
    }
}