public class String1
{

  public static void main (String[] args) 
  {
    String s1 = new String("String 1");
    String s2 = new String("String 1");
    if (s1 == s2) {
        System.out.println("Equal");
    }
    else {
        System.out.println("Not equal");
    }


    String string1 = new String("Coursera");
    // char letter = string1[4];
    char letter = string1.charAt(4);
    System.out.println(letter);


    String s = "Hello";
    s.concat(" World!");
    System.out.println(s);


    String text = "Practice, practice, practice!";
    System.out.println(text.indexOf("prac"));

    
    text = "Hurray!!#! It's Friday! finally...";
    String[] words = text.split("!+");
    System.out.print('[');
    for (String word : words)
    {
        System.out.print(word + ",");
    }
    System.out.println(']');
  }

}
