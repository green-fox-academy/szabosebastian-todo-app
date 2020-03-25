package todo_app;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataList {
  int counter = 1;
  List<String> lines = new ArrayList<>();
  Path filePath = Paths.get("src/todo_app/data.txt");

  public void fileReader() {
    try {
      lines = Files.readAllLines(filePath);
    } catch (Exception e) {
    }
  }

  public void filePrinter() {
    if (lines.size() == 0) {
      System.out.println("No todos for today! :)");
    } else {
      for (String line : lines) {
        System.out.println(counter + " - " + line);
        counter++;
      }
    }
  }
}
