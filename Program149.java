//armstrong number
import java.util.*;
// Print even factors

class Digits
{
    private int CountDigits(int iNo)
    {
        int iCnt = 0;
        while(iNo != 0)
        {
            iCnt++;
            iNo = iNo / 10;
        }
        return iCnt;
    }

    private int Power(int Base,int index)
    {
        int iAns = 1;
        for(int iCnt = 1;iCnt <= index; iCnt++)
        {
            iAns = iAns * Base;
        }
        return iAns;
    }

    public boolean CheckArmStrong(int iNo)
    {
        int iTemp = iNo;
        int iSum = 0;
        int iDigit = 0;
        int iRet = 0;

        int iCount = CountDigits(iNo);

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRet = Power(iDigit,iCount);
            iSum = iSum + iRet;
            iNo = iNo / 10;
        }
        if(iSum == iTemp)
        {
            return true;
        }
        else{
            return false;
        }
    }
}

class Program149
{
    
    public static void main(String arg[])
    {
        int iNo = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter The Number : ");
        iNo = sobj.nextInt();

        Digits nobj = new Digits();

        boolean iAns = nobj.CheckArmStrong(iNo);
        if(iAns == true)
        {
            System.out.println(iNo+ "is a Armstrong number.");

        }
        else
        {
            System.out.println(iNo+ "is not.");
        }
    }
}