////////////////////Find the largest of three number
////////////////////Find the smallest of three numbers.
////////////////////Check whether a year is a leap year.
//////////////////// Check whether a character is a vowel or consonant.
////////////////////Check whether a character is uppercase or lowercase.
////////////////////Print the multiplication table of a given number.
////////////////////Find the sum of numbers from 1 to N.
////////////////////Find the sum of even numbers from 1 to N.
////////////////////Find the sum of odd numbers from 1 to N.
////////////////////Find the factorial of a number.
//////////////////import java.util.*;
//////////////////public class basiclevel{
//////////////////    public static void main(String[] args){
//////////////////        Scanner sc=new Scanner(System.in);
//////////////////        System.out.println("enter three number:");
//////////////////        int number1=sc.nextInt();
//////////////////        int number2=sc.nextInt();
//////////////////        int number3=sc.nextInt();
//////////////////        if((number1>number2) && (number1>number3)){
//////////////////            System.out.println(number1+"is greater than number2 and number3");
//////////////////
//////////////////        }
//////////////////        else if((number2>number1)&&(number2>number3)){
//////////////////            System.out.println(number2+"is greater than number1 and number2");
//////////////////        }
//////////////////        else{
//////////////////            System.out.println("number3 is greater than number2 and number1");
//////////////////        }
//////////////////    }
//////////////////}
////////////////import java.util.*;
////////////////public class basiclevel{
////////////////    public static void main(String[] args){
////////////////        Scanner sc=new Scanner(System.in);
////////////////        System.out.println("enter three numbers");
////////////////        int num1=sc.nextInt();
////////////////        int num2=sc.nextInt();
////////////////        int num3=sc.nextInt();
////////////////        if((num1<num2)&&(num1<num3)){
////////////////            System.out.println("num1 is smaller than num2 and num3");
////////////////        }
////////////////        else if((num2<num1)&&(num2<num3)){
////////////////            System.out.println("num2 is smaller than num1 and num3");
////////////////        }
////////////////        else{
////////////////            System.out.println("num3 is smaller than num2 and num1");
////////////////        }
////////////////    }
////////////////}
//////////////import java.util.*;
//////////////public class basiclevel{
//////////////    public static void main(String[] args){
//////////////        Scanner sc=new Scanner(System.in);
//////////////        int year=sc.nextInt();
//////////////        if((year%400==0)||((year%100!=0 )&&(year%4==0))){
//////////////            System.out.println("Leap year");
//////////////
//////////////        }
//////////////        else {
//////////////            System.out.println("it is not leap year");
//////////////        }
//////////////    }
//////////////}
////////////import java.util.*;
////////////public class basiclevel {
////////////    public static void main(String[] args) {
////////////        Scanner sc = new Scanner(System.in);
////////////        System.out.println("enter a char:");
////////////        char letter = sc.next().charAt(0);
////////////
////////////        if ((letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u')) {
////////////            System.out.println("it is vowel");
////////////        } else {
////////////            System.out.println("it is consonant");
////////////        }
////////////    }
////////////}
//////////import java.util.*;
//////////public class basiclevel{
//////////    public static void main(String[] args){
//////////        Scanner sc=new Scanner(System.in);
//////////        char word=sc.next().charAt(0);
//////////        int word1= (char) word;
//////////        if(word1<=90){
//////////            System.out.println("It is uppercase");
//////////        }
//////////        else{
//////////            System.out.println("it is lowercase");
//////////        }
//////////    }
//////////}
////////import java.util.*;
////////public class basiclevel{
////////    public static void main(String[] args){
////////        Scanner sc=new Scanner(System.in);
////////        int multipleNumber=sc.nextInt();
////////        System.out.println("Enter the multiple number:");
////////        for(int i=1;i<=10;i++){
////////            System.out.println(i+"*"+multipleNumber+"=" +(i*multipleNumber));
////////        }
////////    }
////////}
//////import java.util.*;
//////public class basiclevel{
//////    public static void main(String[] args){
//////        Scanner sc=new Scanner(System.in);
//////        int n=sc.nextInt();
//////        int sum=0;
//////        for(int i=1;i<=n;i++){
//////            sum=sum+i;
//////        }
//////        System.out.println(sum);
//////    }
//////}
////import java.util.*;
////public class basiclevel{
////    public static void main(String[] args){
////        Scanner sc=new Scanner(System.in);
////        int number=sc.nextInt();
////        int sum=0;
////        for(int i=1;i<=number;i++){
////            if(i%2==0){
////                sum=sum+i;
////            }
////        }
////        System.out.println(sum);
////    }
////
////}
//import java.util.*;
//public class basiclevel{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int n=sc.nextInt();
//        int sum=0;
//        for(int i=1;i<=n;i++){
//            if(i%2!=0){
//               sum=sum+i;
//            }
//        }
//        System.out.println(sum);
//    }
//}
import java.util.*;
public class basiclevel{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        int fact=1;
        for(int i=number;i>=1;i--)
        {
           fact= fact*i;
        }
        System.out.println(fact);

    }
}