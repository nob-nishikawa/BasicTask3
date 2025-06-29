package BasicTask3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumber {

  public String ScanningConsole(Scanner scanner) {

    String inputNumber;
    while (true) {
      try {
        System.out.println("携帯の電話番号を入力してください。ハイフン（-）はつけてください");
        System.out.println("[xxx-yyyy-zzzz]の形式です");
        inputNumber = scanner.next();
        break;

      } catch (InputMismatchException e) {
        e.printStackTrace();
        System.err.println("不正な入力です。正しい形式で入力してください");
        scanner.next();

      }
    }
    return inputNumber;
  }
}
