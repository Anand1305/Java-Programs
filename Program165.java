import java.util.*;

class MarvellousX
{
    public int CapitalCount(String s)
    {
        int iCnt = 0;
        char Arr[] = s.toCharArray();
        for(int i = 0; i< Arr.length;i++)
        {
          if(Arr[i] >= 'A' && (Arr[i] <= 'Z'))
          {
            iCnt++;
          }
        }
        return iCnt;
    }
}

class Program165
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Plaese enter String : ");
        String str = sobj.nextLine();

        MarvellousX obj = new MarvellousX();
        int iRet = obj.CapitalCount(str);
        System.out.println("Number of Capital letters in " +str+ " Are "+iRet);
    }
}