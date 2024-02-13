import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//          //Q1 program print number from 1-100 if number %3=0 fizz ,%5=0 buzz ,%3&5=0 fizzBuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else System.out.println(i);
//        }


//        //Q2-write java program to reverse string
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the string:");
//        String words=input.nextLine();
//
//        String rev ="";
//       char ch;
//                for (int i=0;i<words.length();i++) {
//                    ch = words.charAt(i);
//                    rev = ch + rev;
//                }
//System.out.println(rev);



//        //Q3-write program to find the factorial value for any given number
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num=input.nextInt();
//        int fact=1;
//        do {
//            fact=fact*num;
//                    num--;
//        }while(num>=1);
//        System.out.println("The factorial number is :"+fact);

//        //Q4-write program to find the value of one number raised to the power of another
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the first numbers :");
//        int num1=input.nextInt();
//        System.out.println("Enter the second numbers :");
//        int num2=input.nextInt();
//int total=1;
//          for(int i=1;i<=num2;i++){
//              total=total*num1;
//                             }
//        System.out.println("the answer is  "+total);




//        //Q5-write a program read set of integers
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the numbers to add :");
//        int num =input.nextInt();
//        int sum_even=0;
//        int sum_odd=0;
//
//        while (num!=0){
//            if (num% 2==0){
//                        sum_even = sum_even + num;
//
//                    }else
//                        sum_odd = sum_odd + num;
//            num--;
//        }
//                System.out.println("the total odd number is " + sum_odd);
//        System.out.println("the total even number is " + sum_even);




//        //Q6-program show if the number entered by user  is prime or not
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter positive number : ");
//        int num=input.nextInt();
//        boolean flag=false;
//
//        if (num==0 || num==1)
//        {  System.out.println(num+" is not prime number");}
//        else {
//            for (int i = 2; i <= num / 2; ++i) {
//                if (num % i == 0) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (!flag)
//                System.out.println(num + "  is  prime number");
//            else System.out.println(num + " is not prime number");
//        }




//            //Q7-loop for heading for four weeks and 7 days for each week
//        for (int i=1;i<=4;i++){
//            System.out.println("week "+i);
//            for (int j=1;j<=7;j++){
//                System.out.println("Day "+j);
//            }
//        }


//        Q8-program check if the word is palindrome or not
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the word");
        String word=input.nextLine();
        String rep= "";
        char ch;
        for(int i=0;i<word.length();i++){
            ch = word.charAt(i);
                  rep = ch+rep;

        }
        if (word.equals(rep)){
            System.out.println("The word is palindrome");
        }else  System.out.println("The word NOT is palindrome");


    }
}