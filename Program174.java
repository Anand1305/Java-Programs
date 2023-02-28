//template for pattern printing
import java.util.*;
/*
    *   *   *   *
    *   *   *   *
    *   *   *   *
    *   *   *   *
*/
class Pattern
{
    public void Display(int iRow, int iCol)
    {
        //logic
        for(int i = 0;i < iRow;i++)
        {
            for(int j = 0;j< iCol;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}

class Program174
{
    public static void main(String arg[])
    {
        Pattern pobj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of rows : ");
        int i = sobj.nextInt();

      System.out.println("Enter Number of columns : ");
      int j = sobj.nextInt();

        pobj.Display(i,j);
    }
}