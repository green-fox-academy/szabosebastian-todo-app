package todo_app;

public class Todo {
  public static void main(String[] args) {



    //When the application is ran without any arguments
    if (args.length == 0) {
      PrintUsage usage = new PrintUsage();
      usage.withoutArgument();
    }

    //When the application is ran with -l argument, then it should print the tasks that are stored in the file
    if (args[0].equals("-l")) {
      DataList listFile = new DataList();
      listFile.fileReader();
    }

    //When the application is ran with the -a "Feed the monkey" argument ,then it should add a new task with the description Feed the monkey
    if (args[0].equals("-a")) {
      AddTask addPlusRow = new AddTask(args[1].toString());
      addPlusRow.fileWriter();
    }


  }
}
