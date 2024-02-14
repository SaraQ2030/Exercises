import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//      Q1--------------------------------------------------
//        System.out.println("Enter the first number ");
//        int fnum=input.nextInt();
//        System.out.println("Enter the second number ");
//        int snum=input.nextInt();
//       int sum,sub,mult,div,mod;
//
//        System.out.println(fnum+" + "+snum+" = "+(fnum+snum));
//        System.out.println(fnum+" - "+snum+" = "+(fnum-snum));
//        System.out.println(fnum+" x "+snum+" = "+(fnum*snum));
//        System.out.println(fnum+" / "+snum+" = "+(fnum/snum));
//        System.out.println(fnum+" mod "+snum+"="+(fnum%snum));


        //      Q2-----------------------------------------------------------------------

//      System.out.println("Enter number ");
//      int num=input.nextInt();
//      int total;
//      for (int i=1;i<=10;i++){
//      total=num*i;
//      System.out.println(num+" x "+i+" = "+total);
//          }


        //      Q3----------------------------------------------------------------------
//        System.out.println("enter the radius of circle: ");
//        double num=input.nextInt();
//        double area;
//        double pi= 3.14;
//        double total_per;
//
//        total_per=pi*num*2;
//        area=pi*num*num;
//        System.out.println("The perimeter is :"+total_per);
//        System.out.println("The Area is :"+area);

        //      Q4-----------------------------------------------------------------------

//        System.out.println("enter the count number ");
//        int count=input.nextInt();
//        int avr=count;
//        int sum=0;
//
//        while (count!=0){
//            System.out.println("Enter number ");
//            int num=input.nextInt();
//            sum=sum+num;
//            count--;
//        }
//        System.out.println("The avrage is "+(sum/avr));

        //      Q5--------------------------------------------------------------------------

//            System.out.println("Enter first number ");
//            int f_num=input.nextInt();
//        System.out.println("Enter second number ");
//        int s_num=input.nextInt();
//        System.out.println("Enter third number ");
//        int th_num=input.nextInt();
//        int sum=f_num+s_num;
//
//            System.out.println(sum==th_num);

        //      Q6--------------------------------------------------------------------------
//        System.out.println("Enter the word to reverse :");
//        String word=input.nextLine();
//        String rev="";
//        char ch;
//        for (int i=0;i<word.length();i++){
//            ch=word.charAt(i);
//            rev=ch+rev;
//        }
//        System.out.println(rev);


        //      Q7--------------------------------------------------------------------------
//            System.out.println("Enter the number to check if even or odd : ");
//            int num=input.nextInt();
//            if (num %2==0){
//                System.out.println(num+" is Even");
//            }else {
//                System.out.println(num+" is Odd");
//            }

        //      Q8--------------------------------------------------------------------------

//                System.out.println("Enter temperature in Centigrade ");
//                double deg=input.nextDouble();
//                double total=(deg*1.8)+32;
//                System.out.println("Temperature in fahrenheit is "+total);


        //      Q9--------------------------------------------------------------------------
//        System.out.println("Enter the string ");
//        String word =input.nextLine();
//        System.out.println("Enter number ");
//        int num=input.nextInt();
//        System.out.println(word.substring(num,num+1));


        //      Q10--------------------------------------------------------------------------

//        System.out.println("Enter the height");
//        Double high=input.nextDouble();
//        System.out.println("Enter the width");
//        Double wdth=input.nextDouble();
//        System.out.println("Area is "+high+" x "+wdth+" = "+(high*wdth));
//        System.out.println("Perimeter is 2 * ("+high+" + "+wdth+") = "+(2*(high+wdth)));

        //      Q11--------------------------------------------------------------------------

//        System.out.println("Enter the first number ");
//        int fnum = input.nextInt();
//        System.out.println("Enter the second number ");
//        int snum = input.nextInt();
//
//        if (fnum == snum) {
//            System.out.println(fnum + " == " + snum);
//        } else {
//            System.out.println(fnum + " != " + snum);
//        }
//        if (fnum > snum) {
//            System.out.println(fnum + " > " + snum);
//        } else {
//            System.out.println(fnum + " < " + snum);
//        }
//        if(fnum>=snum){
//            System.out.println(fnum+" >= "+snum);
//        } else {
//            System.out.println(fnum+" <= "+snum);}


        //      Q12-------------------------------------------------------------------------------

//        System.out.println("Enter the number of seconds :");
//        int sec=input.nextInt();
//       int total_min=(sec%3600)/60;
//        int total_hour=(sec/3600)%24;
//        int total_sec=sec%60;
//
//
//System.out.println(total_hour+":"+total_min+":"+total_sec);


        //      Q13-------------------------------------------------------------------------------

//        System.out.println("Enter the first number ");
//        int f_num = input.nextInt();
//        System.out.println("Enter the second number ");
//        int s_num = input.nextInt();
//        System.out.println("Enter the third number ");
//        int thir_num = input.nextInt();
//        System.out.println("Enter the fourth number ");
//        int four_num = input.nextInt();
//
//        if ((f_num==s_num)&&(thir_num==four_num)&&(f_num==four_num)){
//
//                            System.out.println("Numbers are equals");
//
//                        } else {System.out.println("Numbers are NOT equals");}

        //      Q14-------------------------------------------------------------------------------
//            System.out.println("Enter number to check");
//            int num=input.nextInt();
//            if(num>0){
//                System.out.println(num+" is positive number");
//            } else if (num<0) {
//                System.out.println(num+" is negative number");
//            }else {  System.out.println(num+" You entered zero");}


        //      Q15-------------------------------------------------------------------------------
//        System.out.println("Enter number or -1 to quit");
//        int num;
//            int positive=0;
//            int negative=0;
//            int zero=0;
//
//            do {
//                num=input.nextInt();
//                if(num>0){
//                    positive=positive+1;
//                } else if (num<0) {
//                    negative=negative+1;
//
//                }else {zero=zero+1;}
//            }while (num !=-1);
//
//            System.out.println(positive + " positive");
//        System.out.println(negative +" negative");
//        System.out.println(zero +" Zero");



        //     Q16-------------------------------------------------------------

        System.out.println("Enter number ");
            int num=input.nextInt();
            int reverse=0;

            while (num>0){
                int rem=num %10;
                reverse = reverse * 10 + rem;
                num=num/10;
            }
        System.out.println("The reverse number is : "+reverse);


        //     Q17------------------------------------------------------------------
//            int num;
//            int large=0;
//            int small=0;
//            System.out.println("Enter the counter ");
//            int cou=input.nextInt();
//            for(int i=1;i<=cou;i++){
//                System.out.println("Enter number ");
//                num=input.nextInt();
//                if(num>large){
//                    large=num;
//                } else if (num<small) {
//                    small=num;
//                }
//
//            }
//           System.out.println("The large number : "+large);
//        System.out.println("The smllest number : "+small);



        //     Q18----------------------------------------------------------------------

//        System.out.println("Enter the sentence");
//            String word=input.nextLine();
//            int count=1;
//            for(int i=0;i<word.length();i++){
//                if (word.charAt(i)==  'a'){
//                    count++;
//                }
//            }
//        System.out.println( word.indexOf("Number of a's =")+count);


    }
}