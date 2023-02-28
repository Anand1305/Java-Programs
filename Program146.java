import java.util.*;
// Print even factors

class Numbers
{
    public void EvenFactorDisplay(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 2; iCnt <= (iNo/2); iCnt+=2)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println("Even Factor is :"+iCnt);
            }
        }
    }
}

class Program146
{
    
    public static void main(String arg[])
    {
        int iNo = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter The Number : ");
        iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.EvenFactorDisplay(iNo);
    }
}