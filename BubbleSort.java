package com.kiranIt;

public class BubbleSort {
    public static void bubbleSort(int a[], int n){
        int i, j, temp;
        boolean swapped ;

        for(i=0; i<n-1; i++){
            swapped= false;
            for(j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)
                break;
        }
    }
    static void printArray(int a[],int size){
        int i;
        for(i=0;i<size;i++){
            System.out.print(a[i]+" ");
            //System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int [] a={12,5,4,8,2};
        int n=a.length;
        bubbleSort(a,n);
        System.out.println("SortedArray");
        printArray(a,n);

    }
}
