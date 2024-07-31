package com.kiranIt;

public class InsertionSort {
    void insertionSort(int a[]){
        int n=a.length;

        for(int i=1;i<n;i++){
            int temp=a[i];
            int j=i-1;

            while (j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=temp;
        }
    }
    void printArray(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        InsertionSort s= new InsertionSort();
        int [] a={4,2,3,6,8,1};
        s.insertionSort(a);
        System.out.println("sortedArray");
        s.printArray(a);



    }
}
