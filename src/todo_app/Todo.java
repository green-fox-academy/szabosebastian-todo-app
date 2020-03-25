package todo_app;

public class Todo {
  public static void main(String[] args) {

    PrintUsage usage = new PrintUsage();
    DataList listFile = new DataList();

    //When the application is ran without any arguments
    if (args.length == 0) {
      usage.withoutArgument();
    }

    //When the application is ran with -l argument, then it should print the tasks that are stored in the file
    else if (args[0].equals("-l")) {
      listFile.fileReader();
    }

  }
}
