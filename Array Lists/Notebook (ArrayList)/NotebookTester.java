import java.util.*;
public class NotebookTester
{
   public static void main (String [] args)
   {
      Notebook n = new Notebook();
      n.addNote("Buy some bread");
      n.addNote("Recharge Phone");
      n.addNote("11:30. Meeting with John.");       
      n.showNote(0);
      n.showNote(1);
      n.showNote(2);
      n.showNote(6);
      n.removeNote(6);
      n.listNotes();
   }
}
