import java.awt.*;
import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        for(int fact=1;fact<=num;fact++){
            if(num%fact==0) {
                System.out.println(fact);
            }
        }
    }
}