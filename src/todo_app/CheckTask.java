package todo_app;

import java.nio.file.Files;

public class CheckTask extends DataList {

  int checkNumber;

  public CheckTask() {

  }

  public CheckTask(int rowNumber) {
    this.checkNumber = rowNumber;
  }

  public void crossTheCorrectRow() {
    super.fileReader();

    if (checkNumber > lines.size()) {
      System.out.println("Unable to remove: index is out of bound");
    }

    if (lines.size() >= 2) {
      lines.set(checkNumber - 1, "+" + lines.get(checkNumber - 1));
    }

    try {
      Files.write(filePath, lines);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not write the file!");
    }
  }
}
