package ArraysQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class QuerriesSetBit
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements : ");
        n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        System.out.println("Array elements : ");
        for(int i = 0; i<n ;i ++){
            int temp;
            temp = in.nextInt();
            arr.add(temp);
        }

        int queries ;
        System.out.println("Enter Number of Queries : ");
        queries = in.nextInt();

        ArrayList<ArrayList<Integer>> Q = new ArrayList<>();
        System.out.println("Enter Queries Array : ");

        for(int i = 0;i<queries;i++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j< 3 ;j++)
            {
                int num = in.nextInt();
                temp.add(num);
            }
            Q.add(new ArrayList<>(temp));
        }

       answerQueries(Q,queries,arr,n);

    }

    static void answerQueries(ArrayList<ArrayList<Integer>> Q, int q , ArrayList<Integer> arr,int n )
    {
        for(ArrayList<Integer> innerList : Q)
        {
            int left = innerList.get(0);
//            System.out.println("left : "+(left-1));
            int right = innerList.get(1);
//            System.out.println("right : "+(right-1));
            int K = innerList.get(2);
//            System.out.println(" k : "+K);

            System.out.println(answerQuery(arr,left-1,right-1,K));
        }
    }

    static int answerQuery(ArrayList<Integer> arr, int left,int right,int K){
        int count = 0 ;
        for (int  i = left;i <= right; i++){
            if(isSetBit(arr.get(i) , K)){
                count++;
            }
        }
        return  count;
    }
    static boolean isSetBit(int num, int k)
    {
        if( (num & ( 1 << (k-1) )) != 0)
        {
            return  true;
        }
        return  false;
    }
}

