package ie.atu.week7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {

            System.out.println("Please enter a number between 0 - 9: ");
            Scanner myscan = new Scanner(System.in);
            boolean valid = false;

            while(valid == false)
            {
                try
                {
                    int myNum = myscan.nextInt();
                    if(myNum <= 9 || myNum > 0)
                    {
                        System.out.println("You entered " + myNum);
                        valid = true;
                    }
                    else
                    {
                        System.out.println("Not a valid number");
                        valid = false;
                    }
                }
                catch(InputMismatchException e)
                {
                    System.out.println("Please enter a number between 0 - 9:");
                    myscan.next();
                    continue;
                }
            }

    }
}
