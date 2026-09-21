////////////////////Count the number of digits in a number.
////////////////////        Find the sum of digits of a number.
////////////////////        Find the product of digits of a number.
////////////////////        Reverse a number.
////////////////////        Check whether a number is a palindrome.
////////////////////        Find the first digit of a number.
////////////////////        Find the last digit of a number.
////////////////////        Count how many even digits are in a number.
////////////////////        Count how many odd digits are in a number.
////////////////////        Find the largest digit in a number.
//////////////////
//////////////////
//////////////////import java.util.*;
//////////////////public class numberproblems{
//////////////////    public static void main(String[] args){
//////////////////        Scanner sc=new Scanner(System.in);
//////////////////        int num=sc.nextInt();
//////////////////        int count=0;
//////////////////        while(num !=0){
//////////////////             num=num/10;
//////////////////            count++;
//////////////////        }
//////////////////        System.out.println(count);
//////////////////
//////////////////
//////////////////
//////////////////    }
//////////////////}
//////////////////
//////////////////
////////////////import java.util.*;
////////////////public class numberproblems{
////////////////public static void main(String[] args){
////////////////    Scanner sc=new Scanner(System.in);
////////////////    int n=sc.nextInt();
////////////////    int sum=0;
////////////////    while(n!=0){
////////////////        int rem=n%10;
////////////////        n=n/10;
////////////////        sum=sum+rem;
////////////////
////////////////    }
////////////////    System.out.println(sum);
////////////////
////////////////
////////////////}
////////////////}
////////////////
////////////////
//////////////import java.util.*;
//////////////public class numberproblems{
//////////////    public static void main(String[] args){
//////////////        Scanner sc=new Scanner(System.in);
//////////////        System.out.println("Enter a number:");
//////////////        int n=sc.nextInt();
//////////////        int product=1;
//////////////        while(n!=0){
//////////////            int rem=n%10;
//////////////            n=n/10;
//////////////            product=product*rem;
//////////////        }
//////////////        System.out.println(product);
//////////////    }
//////////////}
////////////import java.util.*;
////////////public class numberproblems{
////////////    public static void main(String[] args){
////////////        Scanner sc=new Scanner(System.in);
////////////        System.out.println("Enter the number:");
////////////        int n=sc.nextInt();
////////////        int rev=0;
////////////
////////////        while(n!=0){
////////////            int rem=n%10;
////////////            n=n/10;
////////////            rev=rev*10+rem;
////////////
////////////        }
////////////        System.out.println(rev);
////////////
////////////    }
////////////}
//////////import java.util.*;
//////////public class numberproblems{
//////////    public static void main(String[] args){
//////////        Scanner sc=new Scanner(System.in);
//////////        System.out.println("enter the number:");
//////////        int n=sc.nextInt();
//////////        int k=n;
//////////        int rev=0;
//////////        while(n!=0){
//////////            int rem=n%10;
//////////            n=n/10;
//////////            rev=rev*10+rem;
//////////
//////////
//////////        }
//////////        System.out.println(rev);
//////////        if (rev == k) {
//////////            System.out.println("It is palindrome");
//////////
//////////        }
//////////        else{
//////////            System.out.println("It is not palindrome");
//////////        }
//////////    }
//////////}
////////
////////
////////import java.util.*;
////////public class numberproblems{
////////    public static void main(String[] args){
////////        Scanner sc=new Scanner(System.in);
////////        System.out.println("Enter the number:");
////////        int n=sc.nextInt();
////////        while(n>=10){
////////            n=n/10;
////////
////////
////////        }
////////        System.out.println(n);
////////
////////    }
////////}
//////import java.util.*;
//////public class numberproblems{
//////    public static void main(String[] args){
//////        Scanner sc=new Scanner(System.in);
//////        System.out.println("Enter the number:");
//////        int n=sc.nextInt();
//////
//////
//////        int  m=n%10;
//////
//////
//////
//////        System.out.println(m);
//////
//////    }
//////}
////import java.util.*;
////public class numberproblems{
////    public static void main(String[] args){
////        Scanner sc=new Scanner(System.in);
////        System.out.println("Enter the number:");
////        int n=sc.nextInt();
////        int count=0;
////        while(n!=0){
////            int rem=n%10;
////            n=n/10;
////            if(rem%2==0){
////                count++;
////            }
////        }
////        System.out.println(count);
////
////    }
////}
////
////
////
////
////
////
////
////
////
////
////
////
//import java.util.*;
//public class numberproblems{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int n=sc.nextInt();
//        int count=0;
//        while(n!=0){
//            int rem=n%10;
//            n=n/10;
//            if(rem%2!=0){
//                count++;
//            }
//
//        }
//        System.out.println(count);
//    }
//}
import java.util.*;
public class numberproblems{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int lar=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            if(rem>lar){
               lar=rem;

            }
        }
        System.out.println(lar);
    }
}