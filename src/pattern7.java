import java.util.*;
public class pattern7{
    public static void main(String[] args){
        //upper outer
       for(int i=1;i<=5;i++){
           //space
           for(int j=1;j<=5-i;j++){
               System.out.print(" ");
           }
           //star
           for(int j=1;j<=i;j++){
               System.out.print("* ");
           }
           System.out.println(" ");
       }
       //lower outer
        for(int i=4;i>=1;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}