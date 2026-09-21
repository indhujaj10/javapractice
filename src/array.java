////////////////Find the largest element
//////////////import java.util.*;
//////////////public class array{
//////////////    public static void main(String[] args){
//////////////        Scanner sc=new Scanner(System.in);
//////////////        int[] a=new int[5];
//////////////        int largest=a[0];
//////////////        for(int i=0;i<=4;i++){
//////////////           a[i]=sc.nextInt();
//////////////        }
//////////////        for(int i=0;i<=4;i++){
//////////////            System.out.println(a[i]);
//////////////        }
//////////////        System.out.println("find largest element:");
//////////////        for(int i=0;i<a.length;i++){
//////////////            if(a[i]>largest){
//////////////                largest=a[i];
//////////////            }
//////////////        }
//////////////        System.out.println("largest:"+largest);
//////////////
//////////////    }
//////////////}
//////////////Find the smallest element
////////////import java.util.*;
////////////public class array{
////////////    public static void main(String[] args){
////////////        Scanner sc=new Scanner(System.in);
////////////
////////////        int[] a=new int[8];
////////////        for(int i=0;i<a.length;i++){
////////////            a[i]=sc.nextInt();
////////////        }
////////////        int smallest=a[0];
////////////        for(int i=0;i<a.length;i++){
////////////            System.out.println(a[i]);
////////////        }
////////////
////////////        System.out.println("find the smallest element:");
////////////        for(int i=0;i<a.length;i++){
////////////            if(a[i]<smallest){
////////////                smallest=a[i];
////////////            }
////////////        }
////////////
////////////        System.out.println("smallest:"+smallest);
////////////    }
////////////}
////////////Calculate the count palindrome
////////import java.util.*;
////////public class array{
////////    public static void main(String[] args){
////////        int count=0;
////////
////////        for(int i=1;i<=100;i++){
////////            int num=i;
////////            int ori=num;
////////            int rev=0;
////////            while(num>0){
////////                int rem=num%10;
////////                rev=rev*10+rem;
////////                num=num/10;
////////
////////            }
////////            if(ori==rev){
////////                System.out.println(ori);
////////                count++;
////////            }
////////
////////        }
////////        System.out.println("count:"+count);
////////
////////    }
////////}
//////////Calculate the sum
////////
////////
//////import java.util.*;
//////public class array{
//////    public static void main(String[] args){
//////        Scanner sc=new Scanner(System.in);
//////        int[] a=new int[10];
//////
//////        for(int i=0;i<10;i++){
//////            a[i]=sc.nextInt();
//////        }
//////        int sum=0;
//////        for(int i=0;i<10;i++){
//////            sum+=a[i];
//////        }
//////        System.out.println(sum);
//////    }
//////}
//////Count even and odd numbers
////import java.util.*;
////public class array{
////    public static void main(String[] args){
////        Scanner sc=new Scanner(System.in);
////        int[]a=new int[5];
////        for(int i=0;i<5;i++){
////            a[i]=sc.nextInt();
////        }
////        int even=0;
////        int odd=0;
////        for(int i=0;i<5;i++){
////            if(a[i]%2==0){
////              even++;
////            }
////            else{
////                odd++;
////            }
////        }
////        System.out.println("even count:"+even);
////        System.out.println("odd count:"+odd);
////    }
////}
////Reverse an array
//import java.util.*;
//public class array{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int[] a=new int[5];
//        for(int i=0;i<5;i++){
//            a[i]=sc.nextInt();
//
//        }
//        int rev=0;
//        for(int i=5;i>=0;i--){
//
//        }
//    }
//}