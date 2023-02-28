//template for pattern printing
import java.util.*;
/*
   input : Hello

   H    e   l   l   o
   H    e   l   l   o
   H    e   l   l   o
   H    e   l   l   o
   H    e   l   l   o
*/

class Pattern
{
    public void Display(String str)
    {
        //logic
        int i = 0;
        int j = 0;
        for(i = 0;i < str.length();i++)
        {
            for(j = 0;j < str.length();j++)
            {
                System.out.print(str.charAt(j)+"\t");
            }
            System.out.println();
        }
        
    }
}

class Program177
{
    public static void main(String arg[])
    {
        Pattern pobj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String s = sobj.nextLine();

        pobj.Display(s);
    }
}