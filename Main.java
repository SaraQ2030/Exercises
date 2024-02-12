import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//java basic exercises


       //Q1-
//        Scanner input=new Scanner(System.in);
//           System.out.println("Enter your weight ");
//          double weight =input.nextDouble();
//        System.out.println("Enter your Height ");
//        double height =input.nextDouble();
//        double bmi= weight/(height * height);
//        System.out.print("your BMI is :"+ bmi);


//        //Q2-
//        Scanner input=new Scanner(System.in);
//           System.out.println("Enter obtained marks: ");
//          double mark =input.nextDouble();
//        System.out.println("Enter total marks: ");
//        double fmark =input.nextDouble();
//        double perc=mark/fmark*100;
//        System.out.println("The percentage is "+perc+"%");

//        //Q3 currancy
//        System.out.println("Enter the number: ");
//        Scanner input=new Scanner(System.in);
//          double usd =input.nextDouble();
//
//          if(usd>0){
//              System.out.println(usd +"USD is "+ usd%0.908+"$.");
//          }else     System.out.println("Enter valid number");
//
//


//      //Q4-Length of string and reverse it
//
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter String1");
//        String word1 =input.next();
//        StringBuilder input1=new StringBuilder();
//        input1.append(word1);
//        input1.reverse();
//        /*use for to revers string
////        String rev ="";
////        char ch;
//                for (int i=0;i<word1.length();i++) {
////            ch = word1.charAt(i);
////            rev = ch + rev;
////        }*/
//        System.out.println("Lenghth of the string is "+ word1.length());
//        System.out.println("The reverse of the string is : "+input1);

//        //Q5-
//         System.out.println("Enter the string :");
//        Scanner input =new Scanner(System.in);
//        String str=input.next();
//      //  String str="The quick brown fox jumps over the lazy dog";
//        String str2=str.replaceAll("\\s","");
//        String substr=str.substring(10,20);
//        System.out.println(substr);




            //Q6
//
//        System.out.println("Enter the string :");
//        Scanner input =new Scanner(System.in);
//        String str=input.next();
//        System.out.println("Enter the Keyword :");
//        String key=input.next();
//       //  String str="The quick brown fox jumps over the lazy dog";
//       if (str.contains(key))
//       {
//            System.out.println("The key word "+key+" is exist");
//        }else{
//           System.out.println("The key word is not exist");
//       }



//        //Q7
//            System.out.println("Enter the string :");
//           Scanner input =new Scanner(System.in);
//        String str=input.next();
//        System.out.println("Enter the replacement:");
//        String replace2=input.next();
//        String str2=str.replace(str,replace2);
//
//        // String str="The quick brown fox jumps over the lazy dog";
//        //String replace=str.replace("fox","cat");
//        System.out.println(replace2);




//    //Q8-write program read tow string inputs and check if equal ignore cases
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter String1");
//        String word1 =input.next();
//        System.out.println("Enter String 2");
//        String word2=input.next();
//        if (word1.equalsIgnoreCase(word2)){
//            System.out.println(word1+" equal  to "+word2);
//        }else {
//            System.out.println(word1+" Not equal to"+word2);
//        }

//conditions exercise

        //Q1-write program to check the role of user
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the username ");
        String name=input.next();
        System.out.println("Enter the password ");
        String pass=input.next();
        if ((name.equals("admin"))  &&  (pass.equals("1")))
        {
            System.out.println("Welcome admin ");
        } else if    (name.equals("super") && (pass.equals("2")))
        {
            System.out.println("Welcome super-user ");
        } else if ((name.equals("user"))  &&  (pass.equals("3"))) {
            System.out.println("Welcome user ");
        } else { System.out.println("wrong user name or password  ");
        }


////Q2-Write program to compare the greatest number
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the first number : ");
//        int fir_num=input.nextInt();
//        System.out.println("Enter the second number : ");
//        int sec_num=input.nextInt();
//        System.out.println("Enter the third number : ");
//        int third_num=input.nextInt();
//
//        if (fir_num>sec_num) {
//            if (fir_num>third_num)
//            {System.out.println("The greatest number is :"+fir_num);
//            }else {System.out.println("The greatest number is :"+third_num);}
//
//        } else if (sec_num>third_num) {
//            {System.out.println("The greatest number is :"+sec_num);}
//
//        }else {System.out.println("The greatest number is :"+third_num);}




//        //Q3-write program that generate from 1-7 and display the day
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int day= input.nextInt();
//        switch (day){
//            case 1:System.out.println("Sunday");
//                break;
//            case 2:System.out.println("Monday");
//                break;
//            case 3:System.out.println("Tuesday");
//                break;
//            case 4:System.out.println("Wensday");
//                break;
//            case 5:System.out.println("Thirsday");
//                break;
//            case 6:System.out.println("Friday");
//                break;
//            case 7:System.out.println("Saterday");
//                break;
//            default: System.out.println("Enter numbers between 1-7");
//        }


        /*Q4-write program that read corresponding letter grade ....*/
//
//         Scanner input =new Scanner(System.in);
//        System.out.println("Enter your numeric score:");
//     int score =input.nextInt();
//       if ((score>=90)&&(score<=100))
//              {
//                  System.out.println("Numeric score: "+score);
//                   System.out.println("Letter grade "+'A');
//              } else if  ((score>=80)&&(score<=89))
//                       {
//                           System.out.println("Numeric score"+score);
//                           System.out.println("Letter grade "+'B');
//                         }
//       else if  ((score>=70)&&(score<=79))
//       {System.out.println("Numeric score: "+score);
//           System.out.println("Letter grade "+'C');
//       }
//       else if  ((score>=60)&&(score<=69))
//       {
//           System.out.println("Numeric score: "+score);
//           System.out.println("Letter grade "+'D');
//       }
//       else if  ((score>=0)&&(score<=59))
//       {
//           System.out.println("Numeric score: "+score);
//           System.out.println("Letter grade "+'F');
//       }




       /*Q5-write program to take person's age as input and categories them to three categories "child"  "teenager"
        and "adult"*/
//
//        System.out.println("Enter your age :");
//        Scanner input=new Scanner(System.in);
//        int age=input.nextInt();
//   if ((age < 13) && (age >0))
//           System.out.println("you are a Child");
//       else if (age >=13 && age <=19 ){
//           System.out.println("you are a Teenager");
//       } else if (age >=20 && age <150) {
//           System.out.println("ou are an adult ");
//
//       } else
//           System.out.println("please enter valid number");





    }
    }
