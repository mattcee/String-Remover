public class question_three{

  public static void remove(char[] word)
  {
    //return if null
    if(word == null)
    {
      return;
    }
    //return if the only one character in string
    if(word.length < 2)
    {
      return;
    }
    //create a boolean array to check for repeat values
    boolean[] hit = new boolean[256];
    for(int i = 0; i< 256; i++)
    {
      hit[i] = false;
    }
    //used for the next value after the very first value
    int tail = 1;
    //first value always true
    hit[word[0]] = true;
    //check for repeat values
    for(int i = 1; i<word.length; ++i)
    {
      //if not a repeating letter, set hit to true and add it to the array
      if(!hit[word[i]])
      {
        
        word[tail] = word[i];
        ++tail;
        hit[word[i]] = true;
      }


    }
    //remove the rest of the reptition
    int reduce = word.length - tail;
    for(int i = 0; i<reduce; i++)
    {
      word[tail + i] = 0;
    }
  }



  public static void main(String[] args)
  {
    		String s = "abcccdccfgeszdsd";
        char[] arr = s.toCharArray();
        remove(arr);
        for(int i = 0; i<arr.length; i++)
        {
          System.out.print(arr[i]);
        }
        System.out.println("");
  }
}
