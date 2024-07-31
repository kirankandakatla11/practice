package com.kiranIt;

import java.util.HashMap;
import java.util.Map;

public class A3B3C3
{
    public static void main(String[] args) {

        String input="AAABBCCCDDSSSA";

        Map< Character, Integer> map= new HashMap<>();

        for(int i=0; i< input.length();i++){
            if(map.containsKey(input.charAt(i)))
            {
                map.put(input.charAt(i), map.get(input.charAt(i))+1);
            } else{
                map.put(input.charAt(i),1);
            }
        }
        map.forEach((key, value)->System.out.print(key+""+value));
        System.out.println("*******************************");

        //**************************************************************//

        String str="a4b2c1d3";   //output=aaaabbcddd

        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                System.out.print(str.charAt(i));
            }else {
                int x =Character.getNumericValue(str.charAt(i));
                for(int j=1; j<x; j++){
                    System.out.print(str.charAt(i-1));
                }
            }
        }
    }
}
