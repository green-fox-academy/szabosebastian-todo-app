package todo_app;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AddTask {

  String rowAdd;

  public AddTask() {

  }

  public AddTask(String row) {
    this.rowAdd = row;
  }

  public void fileWriter() {

    Path filePath = Paths.get("src/todo_app/data.txt");
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(filePath);

    } catch (Exception e) {
    }

    lines.add(rowAdd);

    try {
      Files.write(filePath, lines);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not write the file!");
    }
  }
}
