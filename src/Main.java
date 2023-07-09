// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        if(input==1)
        {
            System.out.println(input);
        }
        else{
            System.out.print(input+" ");
            while(input>1)
            {
                if(input%2==0){
                    input/=2;
                    System.out.print(input+" ");
                }
                else{
                    input=(3*input)+1;
                    System.out.print(input+" ");
                }
            }
        }
    }
}