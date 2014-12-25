/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.util.*;
public class Mnemonic {
    private static HashMap<Integer,String> myMap = new HashMap<Integer, String>(); 
    public static void call(String input){
        String goodInput = "";
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '1'|| input.charAt(i) == '0'){
                continue;
            }
            goodInput = goodInput + input.charAt(i);
        }
        recMnemonic(goodInput,goodInput.length(),0,"");
    }
    public static void mapInitialize(){
        String [] arr = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        for(int i = 0; i < arr.length; i++){
            myMap.put(i+2, arr[i]);
        }
    }
    public static void recMnemonic(String original, int k, int lenSoFar, String soFar){
        // base case , length of string generated 
        // equals the length of processed number
        if(k == lenSoFar){
            System.out.println(soFar);
        }
        else{
            // pick the current digit from the number
            if(original.charAt(lenSoFar) != '1'&& original.charAt(lenSoFar)!= '0'){
                int key = original.charAt(lenSoFar)-'0';
                // get the striing for the current didgit
                String expression = myMap.get(key);
                // pick each character of the current string 
                for(int i = 0; i < expression.length(); i++){
                    // add character from the current string to anser string 
                    String newSoFar = soFar+expression.charAt(i);
                    // recure to repeat the process
                    recMnemonic(original,k,lenSoFar+1,newSoFar);
                }
            }
        }
    }
    public static void main(String [] args){
        mapInitialize();
        call("427236");
    }
    
}
