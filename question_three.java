public class question_three{

  public static void remove(char[] word)
  {
    if(word == null)
    {
      return;
    }
    if(word.length < 2)
    {
      return;
    }
    boolean[] hit = new boolean[256];
    for(int i = 0; i< 256; i++)
    {
      hit[i] = false;
    }
    int tail = 1;
    hit[word[0]] = true;
    for(int i = 1; i<word.length; ++i)
    {
      if(!hit[word[i]])
      {

        word[tail] = word[i];
        ++tail;
        hit[word[i]] = true;
      }
      else
      {

        word[i] = 0;
      }

    }
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
