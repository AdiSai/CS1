import java.util.*;

public class Notebook
{
    ArrayList<String> notes;
    
        
    public Notebook()
    {
       notes = new ArrayList<String>();
    }
    
    public void addNote(String note)
    {
        notes.add(note);
    }
    public void removeNote(int noteNumber)
    {
        if (noteNumber < notes.size() && noteNumber >= 0)
        {
            notes.remove(noteNumber);
        }
        else
        {
            System.err.println(noteNumber + " is not a valid position, within " + notes);
        }
    }
    public void showNote(int noteNumber)
    {
        if (noteNumber < notes.size() && noteNumber >= 0)
        {
            System.out.println(notes.get(noteNumber));
        }
        else
        {
            System.err.println(noteNumber + " is not a valid position, within " + notes);
        }
    }
    public void listNotes()
    {
        for (int i = 0; i < notes.size(); i++)
        {
            System.out.println(i + ": " + notes.get(i));
        }
        System.out.println();
    }
}
