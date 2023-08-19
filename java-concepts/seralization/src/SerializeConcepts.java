import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeConcepts {

    public static void main(String[] arge) {

        String fileName = "akash.txt";
        Employee emp = new Employee(1, "akash", 5000);
        try {

            
            FileOutputStream fileInput = new FileOutputStream(fileName);

            ObjectOutputStream objOp =new ObjectOutputStream(fileInput);

            objOp.writeObject(emp);
            objOp.close();
            fileInput.close();
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

    }
}