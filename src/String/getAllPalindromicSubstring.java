package String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class getAllPalindromicSubstring {
    public static void main(String[] args) {

        String str = "nitin";
        LinkedList<String> store= new LinkedList<>();
        HashSet<String> ans= new HashSet<>();
        getPalindromicString(str,store,ans , 0);
        for(String element: ans )
        {
            System.out.println(element);
        }
    }
    static void getPalindromicString(String str , LinkedList<String> store, HashSet<String> ans, int index){

        if(index == str.length()){
            for(String s : store){
                ans.add(s);
            }
            return;
        }
        String temp = "";
        for(int i = index ; i<str.length(); i++){
            temp += str.charAt(i);
            if(isPalindrome(temp)) {
                store.add(temp);
                getPalindromicString(str, store, ans,index+1);
                store.removeLast();
            }
        }
    }
    static boolean isPalindrome(String str)
    {
        int i = 0 , l = str.length()-1;
        while(i < l){
            if(str.charAt(i) != str.charAt(l)){
                return  false;
            }
            i++;
            l--;
        }
        return  true;
    }
}
