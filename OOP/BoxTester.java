
/**
 * Write a description of class BoxTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoxTester
{
    public static void main(String[] args)
    {
        Box box1 = new Box(1, 1, 1);
        System.out.println("Volume: " + box1.volume() + "\n" + "Area: " + box1.area());
        Box box2 = new Box(3);
        System.out.println("\n" + "Volume: " + box2.volume() + "\n" + "Area: " + box2.area());
        Box box3 = new Box(box2);
        System.out.println("\n" + "Volume: " + box3.volume() + "\n" + "Area: " + box3.area());
        System.out.println("\n" + "Length: " + box3.getLength() + " Width: " + box3.getWidth() + " Height: " + box3.getHeight());
        Box box4 = box3.biggerBox();
        System.out.println("\n" + "Length: " + box4.getLength() + " Width: " + box4.getWidth() + " Height: " + box4.getHeight());
        System.out.println("\n" + box3.nests(box4));
    }
}

