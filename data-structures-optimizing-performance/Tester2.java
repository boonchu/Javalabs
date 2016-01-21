import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Tester2
{
 
  protected static List<String> getTokens(String text, String pattern)
  {
    ArrayList<String> tokens = new ArrayList<String>();
    Pattern tokSplitter = Pattern.compile(pattern);
    Matcher m = tokSplitter.matcher(text);

    while (m.find()) {
        tokens.add(m.group());
    }

    return tokens;
  }

  public static int mystery(String s)
  {
    char[] letters = s.toCharArray();
    int x = 0;
    for (int i = 0; i < letters.length; i++) {
        if (letters[i] == ' ') {
           letters[i] = '_';
           x++;
        }
    }
    return x;
  }

  public static void main (String[] args) 
  {
    String s1 = new String("String 1");
    String s2 = "String 1";
    if (s1 == s2) {
        System.out.println("Equal");
    } else {
        System.out.println("Not equal");
    }

    String text = "My ";
    s2 = "String";
    text = text + s2;
    System.out.println(text);

    s1 = "My String";
    text = s1;
    System.out.println(text);

    text = new String("My ");
    System.out.println(text + new String("String"));

    text = "My ";
    System.out.println(text.concat("String"));

    text = new String("Hello  World ");
    System.out.println(mystery(text));
    System.out.println("["+text+"]");

    text = "%one%%two%%%three%%%%";
    System.out.print('[');
    for (String word : text.split("[one,two,three]"))
    {
        System.out.print(word + ",");
    }
    System.out.println(']');

    text = "one (1), two (2), three (3)";
    System.out.print('[');
    // for (String word : getTokens(text, "[^, ]+"))
    // for (String word : getTokens(text, "[a-z()0-9]+"))
    for (String word : getTokens(text, "[a-z]+|[()0-9]+"))
    {
        System.out.print(word + ",");
    }
    System.out.println(']');

  }

}
