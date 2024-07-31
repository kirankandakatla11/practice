package com.kiranIt;

public class RotateArray {
        // Method to rotate the array to the right by k steps
        public static void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n; // In case k is greater than the length of the array

            // Reverse the entire array
            reverse(nums, 0, n - 1);
            // Reverse the first k elements
            reverse(nums, 0, k - 1);
            // Reverse the remaining n-k elements
            reverse(nums, k, n - 1);
        }

        // Helper method to reverse a portion of the array
        private static void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // Utility method to print the array
        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Main method to test the rotate method
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;
            System.out.println("Original array:");
            printArray(arr);

            rotate(arr, k);

            System.out.println("Array after rotating to the right by " + k + " steps:");
            printArray(arr);
        }
    }
