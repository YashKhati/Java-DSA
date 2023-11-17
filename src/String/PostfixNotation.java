package String;

import java.util.Scanner;
import java.util.Stack;

public class PostfixNotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T;

        T = in.nextInt();
        while(T > 0){

            String inputNotation;
            inputNotation = in.nextLine();

            StringBuffer ans = new StringBuffer();

            Stack<Character> stack = new Stack<>();

            for(int i=0; i < inputNotation.length(); i++ ){

                if(inputNotation.charAt(i) == '(')
                {
                    stack.push(inputNotation.charAt(i));
                }
                else if(Character.isLetter(inputNotation.charAt(i))){
                    ans.append(inputNotation.charAt(i));
                }
                else if(!Character.isLetter(inputNotation.charAt(i)) && inputNotation.charAt(i) != ')'  ){
                    stack.push(inputNotation.charAt(i));
                }
                else{
                    while(stack.peek() != '(')
                    {
                        char topElement = stack.peek();
                        stack.pop();
                        ans.append(topElement);
                    }
                    stack.pop();
                }
            }
            System.out.print(ans);
            System.out.println();
            T--;
        }
    }
}
