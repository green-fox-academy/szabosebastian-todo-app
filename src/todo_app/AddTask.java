package todo_app;

import java.nio.file.Files;


public class AddTask extends DataList {
  String rowAdd;

  public AddTask() {

  }

  public AddTask(String row) {
    this.rowAdd = row;
  }

  public void fileWriter() {

    super.fileReader();

    lines.add(rowAdd);

    try {
      Files.write(filePath, lines);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not write the file!");
    }
  }
}
