import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String pathOriginal = "C:\\Gin\\module 2\\IO Text File\\Copy file text\\src\\orginal";
        String pathClone = "C:\\Gin\\module 2\\IO Text File\\Copy file text\\src\\clone";
        File original;
        File clone;
        try {
            original = new File(pathOriginal);
            if (!original.exists()){
                original.createNewFile();
            }
            clone = new File(pathClone);
            if (!clone.exists()){
                clone.createNewFile();
            }
            TextFileCopy.copyFile(original,clone);
            System.out.println("Successful!");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
