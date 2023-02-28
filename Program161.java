import java.util.*;

class MarvellousX
{
    public int CapitalCount(String s)
    {
        int iCnt = 0;
        for(int i = 0; i< s.length();i++)
        {
          if(s.charAt(i) >= 'A' && (s.charAt(i) <= 'Z'))
          {
            iCnt++;
          }
        }
        return iCnt;
    }
}

class Program161
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