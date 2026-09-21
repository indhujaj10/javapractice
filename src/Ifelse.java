import java.awt.*;
import java.util.*;


public class Ifelse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0 && num>=0){
            System.out.println("positive,divisible by 2,even");
        }
        else{
            System.out.println("Invalid");
        }
    }
}