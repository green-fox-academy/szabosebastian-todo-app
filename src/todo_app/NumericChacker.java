package todo_app;

import java.util.regex.Pattern;

public class NumericChacker {

  private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

  public boolean isNumeric(String strNum) {
    if (strNum == null) {
      return false;
    }
    return pattern.matcher(strNum).matches();
  }
}
