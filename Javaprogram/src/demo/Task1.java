package demo;

import java.util.*;
import java.lang.*;
class CharNotFound extends  Exception{
    CharNotFound(String msg){
        System.out.println(msg);
    }
}
public class Task1 {
    public void characterLocator(String sentence, String location) {
        try{
            int firstIndex = sentence.indexOf(location);
            int lastIndex = sentence.lastIndexOf(location);
            if(firstIndex >=0 && lastIndex >=0){
                if(firstIndex==lastIndex){
                System.out.println("Common character is :"+sentence.charAt(firstIndex)+" at Index "+firstIndex );
             for(int i=firstIndex,ii=sentence.length();i<ii;i++){
                    for(int j=0,k=location.length();j<k;j++){
                        if(sentence.charAt(i)==location.charAt(j)){
                            System.out.println("character is "+sentence.charAt(i)+" at index "+ i);
                        }
                    }
                } //testing phase


                }else{
                System.out.println("Common character is :"+sentence.charAt(firstIndex)+" at FirstIndex "+firstIndex );
                System.out.println("Common character is :"+sentence.charAt(lastIndex)+ " at LastIndex "+ lastIndex);
                }
            }else
                throw new CharNotFound("Character not found in string more details given below");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        Task1 m = new Task1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Give first string -> ");
        String first = sc.nextLine();
        System.out.print("Give second string -> ");
        String second = sc.nextLine();
        m.characterLocator(first, second);
    }
}


