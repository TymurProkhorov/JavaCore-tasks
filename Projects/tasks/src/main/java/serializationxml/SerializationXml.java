package serializationxml;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;

public class SerializationXml {
    public static void main(String[] args) throws JAXBException {
        Person kolya = new Person();
        kolya.setId(1);
        kolya.setName("Kolya");

        JAXBContext jc = JAXBContext.newInstance(Person.class);
        Marshaller m = jc.createMarshaller();

        File file = null;
        try {
            file = new File("src/main/java/serializationxml/data.xml");
            if (!file.createNewFile())
                System.out.println("File already exists");
        } catch (IOException e) {
            e.printStackTrace();
        }


        m.marshal(kolya, file);
    }
}