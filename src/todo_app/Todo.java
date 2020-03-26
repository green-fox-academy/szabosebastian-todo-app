package todo_app;

public class Todo {


  public static void main(String[] args) {

    NumericChacker num = new NumericChacker();

    try {
      //When the application is ran without any arguments
      if (args.length == 0) {
        PrintUsage usage = new PrintUsage();
        usage.withoutArgument();
      }

      //When the application is ran with -l argument, then it should print the tasks that are stored in the file
      else if (args[0].equals("-l")) {
        DataList listFile = new DataList();
        listFile.fileReader();
        listFile.filePrinter();
      }

      //When the application is ran with the -a "Feed the monkey" argument ,then it should add a new task with the description Feed the monkey
      else if (args[0].equals("-a") && args.length > 1) {
        AddTask addPlusRow = new AddTask(args[1].toString());
        addPlusRow.fileWriter();
      }

      //Add new task error handling
      else if (args[0].equals("-a") && args.length == 1) {
        System.out.println("Unable to add: no task provided");
      }

      //When the application is ran with the -c 2 argument, then it should check the second task from the file
      else if (args[0].equals("-c")) {
        CheckTask checkTask = new CheckTask(Integer.parseInt(args[1]));
        checkTask.crossTheCorrectRow();
      }

      //When the application is ran with the -r 2 argument, then it should remove the second task from the file
      //When the application is ran with the -r 20 argument, then it should show an error message like: Unable to remove: index is out of bound
      else if (args[0].equals("-r") && args.length > 1 && num.isNumeric(args[1]) == true) {
        RemoveTask removeRow = new RemoveTask(Integer.parseInt(args[1]));
        removeRow.removeTheCorrectRow();
      }

      //When the application is ran with the -r apple argument, then it should show an error message like: Unable to remove: index is not a number
      else if (args[0].equals("-r") && args.length > 1 && num.isNumeric(args[1]) == false) {
        System.out.println("Unable to remove: index is not a number");
      }

      //When the application is ran with the -r argument, then it should show an error message like: Unable to remove: no index provided
      else if (args[0].equals("-r") && args.length == 1) {
        System.out.println("Unable to remove: no index provided");
      } else {
        System.out.println("Unsupported argument");
      }
    } catch (Exception e) {
    }
  }
}

