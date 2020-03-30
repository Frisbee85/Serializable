import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person p1 = null;

        try (
                FileInputStream fileInputStream = new FileInputStream(fileName);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            p1 = (Person) objectInputStream.readObject();

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            System.out.println("Nie udało się odczytać pliku.");
        }
        if (p1 != null) {
            System.out.println("Wczyatno dane o:");
            System.out.println(p1.getFirstName() + " " + p1.getLastNAme());
        }
    }
}
