import java.util.*;

public class CalculatorApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         CalculatorApp obj=new CalculatorApp();
        System.out.println("Enter any Two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter number what operation you want to perform");
        System.out.print("1)Addition\n2)Subractation \n3)multipilstion\n4)Division\n");
        int opt=sc.nextInt();
        if(opt==1){
            obj.addition(a,b);
        }
        else if(opt==2){
            obj.Subractation(a,b);
        }
        else if(opt==3){
            obj.multipilaction(a,b);
        }
        else if (opt == 4) {

            obj.division(a,b);
        }
        else {
           System.out.println("Invalid Option");
        }

    }
    public void addition(int a,int b){
        System.out.println("Addition:"+ (a+b));
    }
    public void Subractation(int a,int b){
        System.out.println("subractation:"+ (a-b));
    }
    public void multipilaction(int a,int b){
        System.out.println("multipication:"+ (a*b));
    }
    public void division(int a,int b){
        System.out.println("division:"+(a/b));
    }

}
