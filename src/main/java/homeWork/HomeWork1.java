package homeWork;

public class HomeWork1 {
    public static void main(String[] args) {
        int num1=8;
        int num2=9;
        int num3= 10;
        if (num1> num2 && num1 > num3){
            System.out.println(num1 + " is the largest number");
        } else if (num2 > num1 && num2 >num3) {
            System.out.println(num2 + " is the largest number" );

        }else{
            System.out.println(num3 + " is the largest number");

        }

          char  letter = 'm' ;
        letter = Character.toLowerCase(letter);
        if ( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'  ){
            System.out.println( letter   +   "this is vowel letter");

        }else if(letter >= 'a' &&  letter <= 'z'){
            System.out.println( letter   +   "this is constant letter");

        }else{
            System.out.println( letter   +   "invalid input");
        }
        //  3. Write a Java program to determine if a person is eligible to vote based on their age
       int ageOfPerson = 15;
        if( ageOfPerson >= 18){
            System.out.println("this Person has eligibility");

        }else{
            System.out.println("this Person  not has eligibility");

        }
        //  4. Write a Java program to calculate the factorial of a number using a while loop
      long factorial = 1;
       int num4 = 5;
        if ( num4 < 0 ){
            System.out.println( num4 + "this number not has factorial ");
        }else {
            int i = 1;
            while (i <= num4) {
                factorial *= i;
                i++;
            }
        }
            System.out.println("factorial of   " + num4 + "  is " + factorial);

            //  5. Write a Java program to find the sum of all even numbers between 1 and 100 using a for loop
            int sum = 0;
            int i1 = 0;
            for (; i1 <= 100; i1++) {
                if(i1 % 2 == 0){
                    sum += i1;
                }

            }
            System.out.println("the sum of even no less than 100 is   " + sum);


        }

    }

