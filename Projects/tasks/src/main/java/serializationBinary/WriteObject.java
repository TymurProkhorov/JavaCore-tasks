package serializationBinary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Person Oleg = new Person(1, "Oleg");
        Person Ivan = new Person(2,"Ivan");
        FileOutputStream fos = new FileOutputStream("people.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(Oleg);
        oos.writeObject(Ivan);
        oos.close();
    }
}
