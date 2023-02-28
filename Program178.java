//template for pattern printing
import java.util.*;
/*
   input : 4529
    4   5   2   9
    4   5   2   9
    4   5   2   9
    4   5   2   9
   
*/

class Pattern
{
    public void Display(int iNo)
    {
        int iDigit = 0;
        int iTemp1 = iNo;
        int iTemp2 = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit+"\t");
           
        }
         iTemp2 = iNo;

        System.out.println();
        iTemp1 = iTemp1 / 10;
    }
}

class Program178
{
    public static void main(String arg[])
    {
        Pattern pobj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int i = sobj.nextInt();

        pobj.Display(i);
    }
}