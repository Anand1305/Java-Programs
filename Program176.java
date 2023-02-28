//template for pattern printing
import java.util.*;
/*
    row = 4
    col = 4

    1   2   3   4
    5   6   7   8
    9   1   2   3
    4   5   6   7
*/

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        //logic
        int iCnt = 0;
        for(int i = 0;i < iRow;i++)
        {
            for(int j = 0;j< iCol;j++)
            {
                
               
                System.out.print(((iCnt%9)+1)+"\t");
                iCnt++;

            }
            System.out.println();
        }
    }
}

class Program176
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