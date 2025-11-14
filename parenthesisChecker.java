//alex w
// 11.12.25
import java.util.Scanner;
public class parenthesisChecker{
    
    public static void main (String []args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("what to scan: ");
        String input = myScanner.nextLine().trim();
        myScanner.close();
        
        //boolean isValid = true;
        if(input.length() % 2 ==0 && input.length() >= 2){
            for (int i = input.length()-1; i >= 0; i--){
            //System.out.println(input.charAt(0));
            System.out.println(input.charAt(i));
            
            
            
            if(input.charAt(i) == '('){
                if (input.charAt(i+1) == ')'){
                    System.out.println("safe for this (");
                    input = input.replace(input.substring(i, i+2), "");
                    //input = input.replace(input.charAt(i+1),'\u0000');
                }
            }

            else if (input.charAt(i) == '{'){
                if (input.charAt(i+1) == '}'){
                    System.out.println("safe for this one {");
                    input = input.replace(input.substring(i, i+2), "");
                    //input = input.replace(input.charAt(i+1),"";
                }
            }

            else if (input.charAt(i) == '['){
                System.out.println("here");
                if (input.charAt(i+1) == ']'){
                    System.out.println("safe for this one [");
                    input = input.replace(input.substring(i, i+2), "");
                    //input = input.replace(input.charAt(i+1),"");
                }
            }

            System.out.println("input is " + input);
            //isValid = false;

            
            }

        if(input.length() == 0){
            System.out.println("valid!");
        }
        else{
            System.out.println("invalid!");
        }
        }
        else if (input.length() % 2 != 0){
            System.out.println("invalid!");
            return;
        }
        


    }

}