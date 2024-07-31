package com.kiranIt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        int [][] intervals1= {{1,3},{2,4},{6,8},{9,10}};
        System.out.println("Merged intervals "+ Arrays.deepToString(merge(intervals1)));
    }
    public  static  int [][] merge(int [][] intervals){
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparing(a->a[0]));

        List<int[]> merged = new ArrayList<>();
        int [] currentInterval=intervals[0];
        merged.add(currentInterval);

        for(int[] interval : intervals){
            int currentEnd = currentInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if (currentEnd>=nextBegin){
                currentInterval[1]=Math.max(currentEnd,nextEnd);
            }
            else{
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
    // output:- Merged intervals [[1, 4], [6, 8], [9, 10]]
}
