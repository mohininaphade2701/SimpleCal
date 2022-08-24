package CALCULATOR.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter First number: ");
            int x = Integer.parseInt(br.readLine());
            System.out.print("Enter Second number: ");
            int y = Integer.parseInt(br.readLine());
            System.out.print("Enter Operator: ");
            String op = br.readLine();
 
            int z;
 
            if (op.equals("+")) {
                z = x+y;
            } else if (op.equals("-")){
                z = x-y;
            } else if (op.equals("*")){
                z = x*y;
            } else if (op.equals("/")){
                z = x/y;
            } else{
                 throw new java.lang.Error("Operator not recognized");
            }
            System.out.println("Result: " + z);
 
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
}
