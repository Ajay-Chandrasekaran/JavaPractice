package learninglambdas;
// lambda 1

import java.io.File;
import java.io.FileFilter;

public class LambdaOne {
    public static void main(String[] args) {
        // Using anonymous class
        // FileFilter fileFilter = new FileFilter() {
        //     @Override
        //     public boolean accept(File file) {
        //         return file.getName().endsWith(".bat");
        //     }
        // };

        FileFilter fileFilter = (File file) -> file.getName().endsWith(".bat");
        File dir = new File("C:/SAPDevelop");
        File[] files = dir.listFiles(fileFilter);

        for (File file: files) {
            System.out.println(file);
        }
    }
}