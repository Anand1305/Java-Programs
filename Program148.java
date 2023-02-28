import java.util.*;
// Print even factors

class Numbers
{
    public int EvenFactorDisplay(int iNo)
    {
        int iCnt = 0, iMul = 1;
        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iMul = iMul * iCnt;
            }
        }
        return iMul;
    }
}

class Program148
{
    
    public static void main(String arg[])
    {
        int iNo = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter The Number : ");
        iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iAns = nobj.EvenFactorDisplay(iNo);
        System.out.println("Multiplication of Factor is "+iNo +" is "+iAns);
    }
}