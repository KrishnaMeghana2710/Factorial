package factorial;

import java.util.*;

public class factorial{
    public static void main(String[] args) {
        //taking an input from the user
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);

        //reading the number 
        int number = sc.nextInt();
        //calling the factorial method and storing it in a variable
        int result = calculateFactorial(number);
        
        //printing the result
        System.out.println("Factorial of "+number+" is "+result);
        sc.close();
    }

    public static int calculateFactorial(int number){
        int result = 1;
        int iterator = number;
        if(number == 0 || number == 1){
            result = 1;
        }
        
        else{
        while(iterator > 0){
            result = result * iterator;
            iterator --;
        }
        }
        return result;
    }
}