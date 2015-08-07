
/**
 * This program computes all the Armstrong numbers in the range of
 * 0 to 999.  An Armstrong number is a number such that the sum
 * of its digits raised to the third power is equal to the number 
 * itself.  For example 371 is an Armstrong number since
 * 3**3 + 7**3 + 1**3 = 371.
 * 
 * @author Louie F. Cervantes
 * @version mm/dd/2015
 */
public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int abc, a3b3c3;
        int count = 0;
        
        System.out.println("List of Armstrong Numbers in the range 0 to 999");
        for (int a = 0; a < 10; a++)
        {
            for (int b = 0; b < 10; b++)
            {
                for (int c = 0; c < 10; c++)
                {
                    abc = a * 100 + b * 10 + c;
                    
                    a3b3c3 = (int) Math.pow(a, 3) + (int) Math.pow(b, 3) + (int) Math.pow(c, 3);

                    if (abc == a3b3c3)
                    {
                        count++;                        
                        System.out.println("Armstrong number " + count + ": " + abc);
                    }
                }
            }
        }
    }
}
