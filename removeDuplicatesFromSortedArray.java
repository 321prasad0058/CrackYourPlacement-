class Solution {
    public int removeDuplicates(int[] nums) {
        
       int i =0; 
       for(int j=1; j<nums.length; j++)
       {
        // If not same , incr i by 1 and change element with j
        if(nums[i]!=nums[j])
        {
            i++;
            nums[i]=nums[j];
        }
       }
       return i+1;  // i is no. of elements, i+1 is total size

    }
}
