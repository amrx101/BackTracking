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
        if(k == lenSoFar){
            System.out.println(soFar);
        }
        else{
            if(original.charAt(lenSoFar) != '1'&& original.charAt(lenSoFar)!= '0'){
                int key = original.charAt(lenSoFar)-'0';
                String expression = myMap.get(key);
                for(int i = 0; i < expression.length(); i++){
                    String newSoFar = soFar+expression.charAt(i);
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
