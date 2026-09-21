//////////////////Check whether a number is positive or negative.
//////////////////Check whether a number is even or odd.
//////////////////Check whether a person is eligible to vote.
//////////////////Find the greater of two numbers.
//////////////////Check whether a number is zero or non-zero.
//////////////////Print numbers from 1 to 10 using for.
//////////////////Print numbers from 10 to 1 using for.
//////////////////Print numbers from 1 to 20 using while.
//////////////////Print all even numbers from 1 to 50.
//////////////////Print all odd numbers from 1 to 50.
////////////////import java.util.*;
////////////////public class simplelevel{
////////////////    public static void main(String[] args){
////////////////        Scanner sc=new Scanner(System.in);
////////////////        System.out.println("Enter a number:");
////////////////        int num=sc.nextInt();
////////////////        if(num>0){
////////////////            System.out.println("It is positive");
////////////////        }
////////////////        else if(num<0){
////////////////            System.out.println("It is negative");
////////////////        }
////////////////        else{
////////////////            System.out.println("Invalid input");
////////////////        }
////////////////    }
////////////////}
//////////////
//////////////import java.util.*;
//////////////public class simplelevel{
//////////////    public static void main(String[] args){
//////////////        Scanner sc=new Scanner(System.in);
//////////////        System.out.println("Enter a number:");
//////////////        int num=sc.nextInt();
//////////////        if(num%2==0){
//////////////            System.out.println("It is even");
//////////////        }
//////////////        else if(num!=0){
//////////////            System.out.println("It is odd");
//////////////        }
//////////////        else{
//////////////            System.out.println("Invalid input");
//////////////        }
//////////////    }
//////////////}
////////////import java.util.*;
////////////public class simplelevel{
////////////    public static void main(String[] args){
////////////        Scanner sc=new Scanner(System.in);
////////////        System.out.println("enter your age:");
////////////        int age=sc.nextInt();
////////////        if(age>=18){
////////////            System.out.println("Your eligible");
////////////        }
////////////        else{
////////////            System.out.println("your not eligible");
////////////        }
////////////    }
////////////}
//////////import java.util.*;
//////////public class simplelevel{
//////////    public static void main(String[] args){
//////////        Scanner sc=new Scanner(System.in);
//////////        Scanner obj=new Scanner (System.in);
//////////        System.out.println("Enter two number");
//////////        int num1=sc.nextInt();
//////////        int num2=obj.nextInt();
//////////        if(num1>num2){
//////////            System.out.println(num1 +"is greater than in" +num2);
//////////        }
//////////        else{
//////////            System.out.println(num2+"is greater than"+num1);
//////////        }
//////////    }
//////////}
////////import java.util.*;
////////public class simplelevel{
////////    public static void main(String[] args){
////////        Scanner sc=new Scanner(System.in);
////////        System.out.println("Enter a number:");
////////        int number=sc.nextInt();
////////        if(number==0){
////////            System.out.println("zero");
////////        }
////////        else{
////////            System.out.println("non-zero");
////////        }
////////
////////    }
////////}
//////import java.util.*;
//////public class simplelevel{
//////    public static void main(String[] args){
//////
//////        for( int i=1;i<=10;i++){
//////            System.out.println(i);
//////        }
//////    }
//////}
////import java.util.*;
////public class simplelevel{
////    public static void main(String[] args){
////        for(int i=10;i>=1;i--){
////            System.out.println(i);
////        }
////    }
////}
//import java.util.*;
//public class simplelevel{
//    public static void main(String[] args){
//        int i=1;
//        while(i<=20){
//            System.out.println(i);
//            i++;
//        }
//    }
//}
import java.util.*;
public class simplelevel{
    public static void main(String[] args){
        for(int i=1;i<=50;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}