public class Letter 
{

  public static String replace(String word, char gone, char here)
  {
    // toCharArray() returns a copy of String object
    char[] cArray = word.toCharArray();
    for (char c : cArray)
    {
        if (c == gone)
        {
            c = here;
        }
    }
    // remember? String object is immutable?
    // return word;
    return new String(cArray);
    
  }


  public static String replacewith(String word, char gone, char here)
  {
    // toCharArray() returns a copy of String object
    char[] cArray = word.toCharArray();
    char[] cArrayMod = new char[cArray.length];
    int i = 0;
    for (char c : cArray)
    {
        if (c == gone)
            cArrayMod[i] = here;
        else
            cArrayMod[i] = c;
        i++;
    }
    return new String(cArrayMod);
    
  }


  public static int hasLetter(String word, char letter)
  {
    // for (char c: word.toCharArray())
    for (int i = 0; i < word.length(); i++)
    {
        if (word.charAt(i) == letter)
        {
            return i;
        }
    }
    return -1;
  }


  public static void main (String[] args) 
  {
    Letter l = new Letter();
    int index = l.hasLetter("Can you hear me? Hello, hello?", 'h');
    System.out.println(index);
    
    // String is immutable. Always returns with 'a happy' string.
    System.out.println(l.replace("a happy", 'a', 'i'));

    System.out.println(l.replacewith("a happy", 'a', 'i'));
  }

}
