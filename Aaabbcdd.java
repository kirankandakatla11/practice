package com.kiranIt;

public class Aaabbcdd {
    public static void main(String[] args) {
        String input="AAABBCCCDDSSSA";  //output: A3B2C3D2S3A1
        String result="";
        int count=0;

        for(int i=0; i<input.length();i++){
            if(i==0){
                result=result+input.charAt(i);
                count++;
            }
            if(i!=0 && (input.charAt(i)==input.charAt(i-1))){
                count++;
            } else if (i!=0 && input.charAt(i)!=input.charAt(i-1)) {
                result=result+count+input.charAt(i);
                count=1;
            }
            if(i==input.length()-1){
                result=result+count;
            }
        }
System.out.println(result);

    }
}
