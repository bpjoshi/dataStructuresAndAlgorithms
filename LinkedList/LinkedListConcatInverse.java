class LinkedListConcatInverse
{
   static class DictionaryEntry
   {
      String word;
      String meaning;
      DictionaryEntry next;
   }
   //DictionaryInfo class is needed to build dictionary and remember first and last word
   static class DictionaryInfo
   {
      DictionaryEntry top;
      DictionaryEntry last;
   }
   
   public static void main (String [] args)
   {
      String [] wordsI = { "bar", "big", "bypass" };
      DictionaryInfo firstList = new DictionaryInfo ();
      buildList (firstList, wordsI);
      print ("First List =", firstList.top);
      String [] wordsII = { "car", "cigarette", "cyclone" };
      DictionaryInfo secondList = new DictionaryInfo ();
      buildList (secondList, wordsII);
      print ("Second List =", secondList.top);
      //Concatenation
      firstList.last.next = secondList.top;
      print ("New master list =", firstList.top);
      invert (firstList);
      print ("Inverted new master list =", firstList.top);
   }
   static void buildList (DictionaryInfo li, String [] words)
   {
      if (words.length == 0)
          return;
      // Create a node for first word/meaning
      li.top = new DictionaryEntry ();
      li.top.word = words [0];
      li.top.meaning = null;
      // Initialize last reference variable to
      // simplify append and make concatenation possible.
      li.last = li.top;
      for (int i = 1; i < words.length; i++)
      {
           // Create (and append) a new node for next word/meaning
           li.last.next = new DictionaryEntry ();
           li.last.next.word = words [i];
           li.last.next.meaning = null;
           li.last = li.last.next;
      }
      li.last.next = null;
   }
   static void print (String msg, DictionaryEntry top)
   {
      System.out.print (msg + " ");
      while (top != null)
      {
         System.out.print (top.word + " ");
         top = top.next;
      }
      System.out.println ();
   }
   static void invert (DictionaryInfo li)
   {
      DictionaryEntry p = li.top, q = null, r;
      while (p != null)
      {
         r = q;
         q = p;
         p = p.next;
         q.next = r;
      }
      li.top = q;
   }
}