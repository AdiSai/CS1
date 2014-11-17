
/**
 * Write a description of class BurritoMaker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BurritoMaker
{
   public static void main(String[] args)
   {
       ChiptoleBurrito bur1 = new ChiptoleBurrito();
       ChiptoleBurrito bur2 = new ChiptoleBurrito();
       if (bur1.equals(bur2))
       {
           System.out.println("Equal");
       }
        else
       {
            System.out.println("Not equal");
       }
       bur1.changePrice(7.50);
       System.out.println("Original calories: " + bur1.calories);
       System.out.println("Original price : " + bur1.price);
       bur1.addGuac();
       System.out.println("Calories with guac: " + bur1.calories);
       System.out.println("Price with guac : "+ bur1.price);
       bur1.noBeans();
       System.out.println("Calories with no beans : " + bur1.calories);
       bur1.extraBeans();
       System.out.println("Price with extra beans " + bur1.price);
       System.out.println("Calories with extra beans: " + bur1.calories);
       bur1.studentDiscount();
       System.out.println("The final price with your student discount is " + bur1.price);
       System.out.println(bur1);
    }
}
