package String;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        while (T > 0){

            int n;
            n = sc.nextInt();

            Stack<Integer> stack = new Stack<>();
            ArrayList<Integer> A = new ArrayList<>();
            ArrayList<Integer> B = new ArrayList<>();

            boolean flag = true;

            for(int i = 0; i<n; i++){
                int temp;
                temp = sc.nextInt();
                A.add(temp);
            }

            while(!A.isEmpty()){

                if(stack.isEmpty()){
                    stack.push(A.get(0));
                    A.remove(0);
                }
                else if(stack.peek() >= A.get(0)){
                    stack.push(A.get(0));
                    A.remove(0);
                }
                else{
                    int index = B.size()-1;
                    if(A.get(index) > stack.peek()){
                        flag = false;
                        break;
                    }

                    B.add(stack.peek());
                    stack.pop();
                }
            }

            if(!flag){
                System.out.println("NO");
            }else{

                while(!stack.isEmpty()){
                    if(B.get(B.size() -1 )  > stack.peek()){
                        break;
                    }
                    B.add(stack.peek());
                    stack.pop();
                }

                if(stack.isEmpty()){
                    System.out.println("Yes");
                }else{
                    System.out.println("NO");
                }
            }
            T--;
        }

    }
}
