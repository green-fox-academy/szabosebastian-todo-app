package todo_app;

public class Todo {
  public static void main(String[] args) {

    PrintUsage usage = new PrintUsage();

    //When the application is ran without any arguments
    if (args.length == 0) {
      usage.withoutArgument();
    }
  }
}
