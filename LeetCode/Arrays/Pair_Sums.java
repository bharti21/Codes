import java.util.*;

class Solution {
    public int solve(int[] a) {
        int odd=0,n=a.length;
        
        for(int i =0;i<n;i++){
            if(a[i]%2!=0)
            odd++;
        }
       
        return odd*(n-odd);
    }
}

/*
Given a list of positive integers nums, return the number of valid pairs of indices (i, j), with i < j, such that A[i] + A[j] is an odd number.
Input
nums = [3, 2, 4]
Output
2
*/