import java.io.File;
import java.io.IOException;
import java.util.*;;
public class q23 {
    public static void main(String[] args) {
        File file = new File("path_to_your_file.txt");

        try {
           

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch(IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
