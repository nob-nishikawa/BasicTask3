package BasicTask3;

import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BasicTask3Main {

  public static void main(String[] args) {

//    一般的な携帯番号を取得する正規表現
    String regex = "([0-9]{3})-([0-9]{4})-([0-9]{4})";
    Pattern pattern = Pattern.compile(regex);

    String inputNumber;
    InputNumber scanLine = new InputNumber();
    RegexMatching regexMatching = new RegexMatching();

    try (Scanner scanner = new Scanner(System.in)) {
      inputNumber = scanLine.ScanningConsole(scanner);
      Optional<String> number = regexMatching.RegexMatch(pattern, inputNumber);
      number.ifPresentOrElse(s -> System.out.println(s + "は有効な番号です"),
          () -> System.err.println("入力された番号は有効ではありません"));

//      入力された数字と正規表現のマッチング
//      条件１１桁、頭の３桁が090 090 070 prefix
//      MNOidentification number 4
//      suffix number 4

    }
  }
}
