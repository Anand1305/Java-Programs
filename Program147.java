import java.util.*;
// Print even factors

class Numbers
{
    public void DisplayCommonFactors(int iNo1,int iNo2)
    {
        int iCnt = 0;
        
        System.out.println("Common Factors Are : ");

        for(iCnt = 1; (iCnt <= iNo1/2) && (iCnt <= iNo2/2);iCnt++)
        {
            if((iNo1 % iCnt == 0) && (iNo2 % iCnt == 0))
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program147
{
    
    public static void main(String arg[])
    {
        int iNo1 = 0,iNo2 = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter The Number 1: ");
        iNo1 = sobj.nextInt();

         
        System.out.println("Enter The Number 2: ");
        iNo2 = sobj.nextInt();


        Numbers nobj = new Numbers();

        nobj.DisplayCommonFactors(iNo1,iNo2);
    }
}