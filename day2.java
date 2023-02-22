import java.util.Scanner;

public class day2 {
    public static void main (String args[]){ 
    // Scanner sc = new Scanner(System.in);
    // int age = sc.nextInt();

    // if(age>=18){
    // System.out.println("You are eligible to driving");
    // }else{
    //   System.out.println("You are not eligible to driving");
    // }


    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a number :");
    // int number=sc.nextInt();
    // if(number%2==0){
    //     System.out.print("This is an even number");
    // }
    //  else{
    //     System.out.println("This is not an even number");
    //  }


     Scanner sc = new Scanner(System.in);
     System.out.println("Enter first number x : ");
     int x = sc.nextInt();
     System.out.println("Enter second number y : ");
     int y = sc.nextInt();
     if(x==y){
        System.out.println("Both number are equal");
     }
     else{
        if(x>y){
            System.out.println("x  is greater than y");
        }
        else{
            if(x<y){
                System.out.println("x is less than y");
            }
            else{
                System.out.println("Please enter valid numbers");
            }
        }
     }
}
}