import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteReadCopy {
    public static void main(String[] args) {
        File obj = new File("Example.txt");
        System.out.println("Creating a new file and writing in it");
        try {
            if (obj.createNewFile()) {
                System.out.println("Created file " + obj.getName() + " successfully");
                FileWriter Writer = new FileWriter("Example.txt");
                Writer.write( "Name: Sanket Dawange\n");
                Writer.write( "Roll No: 18\n");
                Writer.write( "Address: Kopargaon, 423601\n");
                Writer.close();
                System.out.println("Successfully written.");
            } else {
                System.out.println("File name already exist");
            }

        } catch (Exception e) {
            System.out.println("Exception occured");
        }
    }
}
