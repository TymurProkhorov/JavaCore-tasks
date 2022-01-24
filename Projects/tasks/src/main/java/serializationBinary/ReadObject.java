package serializationBinary;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("people.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person Oleg = (Person) ois.readObject();
        Person Ivan = (Person) ois.readObject();

        System.out.println(Oleg);
        System.out.println(Ivan);

        ois.close();
    }
}
