//armstrong number
import java.util.*;
// Print even factors

class Digits
{
    
    public boolean CheckArmStrong(int iNo)
    {
        int iDigitCount = 0;
        int iTemp = iNo;
        int iDigit = 0;
        int iCnt = 0;
        int iPower = 1;
        int iSum = 0;

        while(iTemp != 0 )
        {
            iDigitCount++;
            iTemp = iTemp/10;
        }
        iTemp = iNo;

        while(iTemp != 0)
        {
            iDigit = iTemp % 10;
            
            for(iCnt = 1; iCnt <= iDigitCount ; iCnt++)  //Logic To Calculate Power
            {
                iPower = iPower * iDigit;
            }

            iSum = iSum + iPower;
            iPower = 1;

            iTemp = iTemp / 10;
        }

        if(iSum == iNo)
        {
            return true;
        }
        else{
            return false;
        }

        
    }
}

class Program150
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