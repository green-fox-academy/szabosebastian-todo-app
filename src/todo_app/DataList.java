package todo_app;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataList {

  public void fileReader() {
    int counter = 1;
    Path filePath = Paths.get("src/todo_app/data.txt");
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(filePath);

    } catch (Exception e) {
    }

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
