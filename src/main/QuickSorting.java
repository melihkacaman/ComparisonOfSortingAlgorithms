package main;

import java.io.*;

class QuickSorting {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] a, int p, int r) {
        while(p<r)
        {
            int q=partition(a,p,r);
            if (q-p <= r-(q+1))
            {
                quickSort(a,p,q);
                p=q+1;
            }
            else
            {
                quickSort(a,q+1,r);
                r=q;
            }
        }
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, high);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    static public void main (String[] args)
    {
        int []arr = new int[50];
        for (int i = 0; i <50; i++) {
            arr[i] = i;
        }
        QuickSorting sorting = new QuickSorting();
        sorting.sortArray(arr);

        for (int i = 0; i <50; i++) {
            System.out.print(" " +  arr[i]);
        }
    }
}