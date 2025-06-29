package BasicTask3;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatching {

  public Optional<String> RegexMatch(Pattern pattern, String inputNumber) {

    Matcher matcher = pattern.matcher(inputNumber);
    if (matcher.matches()) {
      return Optional.of(matcher.group());
    } else {
      return Optional.empty();
    }

  }

}
