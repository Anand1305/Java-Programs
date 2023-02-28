import java.util.*;
class Program158
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Plaese enter your full name : ");
        String str = sobj.nextLine();

        System.out.println("Welcome "+str);

        System.out.println("Number of charcters are : "+str.length());

        for(int i = 0;i< str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}