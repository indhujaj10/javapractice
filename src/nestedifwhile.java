//////////////////////Find the largest of 3 numbers using nested if.
//////////////////////Create a simple login system using nested if.
//////////////////////Check whether a person can vote and drive using nested if.
//////////////////////Check whether a number is positive, negative, and even/odd.
//////////////////////Print numbers from 1 to N using while.
//////////////////////Reverse a number using while.
//////////////////////Check palindrome using while.
//////////////////////Find the sum of digits using while.
//////////////////////Keep asking for a number until the user enters 0.
//////////////////////Keep asking for a password until the correct password is entered.
////////////////////
////////////////////import java.util.*;
////////////////////public class nestedifwhile{
////////////////////    public static void main(String[] args){
////////////////////        Scanner sc=new Scanner(System.in);
////////////////////        int n1=sc.nextInt();
////////////////////        int n2=sc.nextInt();
////////////////////        int n3=sc.nextInt();
////////////////////        if(n1>n2){
////////////////////            if(n1>n3){
////////////////////                System.out.println(n1);
////////////////////            }
////////////////////            else{
////////////////////                System.out.println(n3);
////////////////////            }
////////////////////        }
////////////////////        else{
////////////////////            if(n2>n3){
////////////////////                System.out.println(n2);
////////////////////            }
////////////////////            else{
////////////////////                System.out.println(n3);
////////////////////            }
////////////////////        }
////////////////////
////////////////////    }
////////////////////}
//////////////////import java.util.*;
//////////////////public class nestedifwhile{
//////////////////    public static void main(String[] args){
//////////////////        Scanner sc=new Scanner(System.in);
//////////////////        int userId=sc.nextInt();
//////////////////        int password=sc.nextInt();
//////////////////        if(userId==1001){
//////////////////            if(password==1011){
//////////////////                System.out.println("LOGIN SUCCESSFULLY");
//////////////////            }
//////////////////            else{
//////////////////                System.out.println("PASSWORD IS WRONG");
//////////////////            }
//////////////////        }
//////////////////        else{
//////////////////            System.out.println("USERID IS INVALID");
//////////////////        }
//////////////////    }
//////////////////}
////////////////import java.util.*;
////////////////public class nestedifwhile{
////////////////    public static void main(String[] args){
////////////////        Scanner sc=new Scanner(System.in);
////////////////        int age=sc.nextInt();
////////////////        if(age>=18){
////////////////            System.out.println("person can vote and drive");
////////////////        }
////////////////        else {
////////////////            System.out.println("peson can't vote and drive");
////////////////        }
////////////////    }
////////////////}
//////////////import java.util.*;
//////////////public class nestedifwhile{
//////////////    public static void main(String[] args){
//////////////        Scanner sc=new Scanner(System.in);
//////////////        System.out.println("Enter whether you have license or not:");
//////////////        int age=sc.nextInt();
//////////////
//////////////        boolean hasLiesence=sc.nextBoolean();
//////////////        if(age>=18){
//////////////            if(hasLiesence){
//////////////                System.out.println("he can drive");
//////////////            }
//////////////            else{
//////////////                System.out.println("he can't drive");
//////////////            }
//////////////        }
//////////////
//////////////
//////////////    }
//////////////}
////////////import java.util.*;
////////////public class nestedifwhile{
////////////    public static void main(String[] args){
////////////
////////////        Scanner sc=new Scanner (System.in);
////////////        int number=sc.nextInt();
////////////        if(number>0)
////////////        {
////////////            if(number%2==0){
////////////                System.out.println("Even and Positive");
////////////            }
////////////            else{
////////////                System.out.println("Odd and negative");
////////////            }
////////////        }
////////////        else{
////////////            System.out.println("Negative");
////////////        }
////////////
////////////    }
////////////}
//////////import java.util.*;
//////////public class nestedifwhile{
//////////    public static void main(String[] args){
//////////        Scanner sc=new Scanner(System.in);
//////////        int n=sc.nextInt();
//////////        int i=1;
//////////
//////////        while(i<=n){
//////////            System.out.println(i);
//////////            i++;
//////////
//////////        }
//////////    }
//////////}
////////import java.util.*;
////////public class nestedifwhile{
////////    public static void main(String[] args){
////////        Scanner sc=new Scanner(System.in);
////////        int num=sc.nextInt();
////////        int rev=0;
////////        while(num!=0){
////////            int rem=num%10;
////////            num=num/10;
////////            rev=rev*10+rem;
////////        }
////////        System.out.println(rev);
////////
////////    }
////////}
//////import java.util.*;
//////public class nestedifwhile{
//////    public static void main(String[] args){
//////        Scanner sc=new Scanner(System.in);
//////        int num=sc.nextInt();
//////        int rev=0;
//////        while(num!=0){
//////            int rem=num%10;
//////            num=num/10;
//////            rev=rev*10+rem;
//////
//////        }
//////        if(rev==num){
//////            System.out.println("it is palindrome");
//////        }
//////        else{
//////            System.out.println("It is not palindrome");
//////        }
//////    }
//////}
////import java.util.*;
////public class nestedifwhile{
////    public static void main(String[] args){
////        Scanner sc=new Scanner(System.in);
////        int num=sc.nextInt();
////        int sum=0;
////        while(num!=0){
////            int rem=num%10;
////            num=num/10;
////            sum=sum+rem;
////        }
////        System.out.println(sum);
////    }
////}
//import java.util.*;
//public class nestedifwhile{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//
//        while(true){
//
//            int num=sc.nextInt();
//            if(num==0){
//                break;
//            }
//        }
//    }
//}
import java.util.*;
public class nestedifwhile{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(true){
            int pass=sc.nextInt();
            if(pass==1011){
                break;
            }
        }
    }
}