import java.util.*;
import java.io.*;



class JavaDataTypesExample{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        long min = -9223372036854775808L;
        long max = 9223372036854775807L;
        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte");
                } if(x>=-32768 && x<=32767){
                    System.out.println("* short");
                } if(x>=-2147483648 && x<=2147483647L){
                    System.out.println("* int");
                } if(x>=min && x<= max){
                    System.out.println("* long");
                }else{
                    System.out.println(sc.next()+" can't be fitted anywhere.");
                }
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



