package todo_app;

import java.nio.file.Files;

public class RemoveTask extends DataList{
  int checkNumber;

  public RemoveTask() {

  }

  public RemoveTask(int rowNumber) {
    this.checkNumber = rowNumber;
  }

  public void removeTheCorrectRow() {
    super.fileReader();

    if (checkNumber > lines.size()) {
      System.out.println("Unable to remove: index is out of bound");
    }

    else if (lines.size() >= 2) {
      lines.remove(checkNumber-1);
    }

    try {
      Files.write(filePath, lines);
    } catch (Exception e) {
      System.out.println("Uh-oh, could not remove the row!");
    }
  }

}
