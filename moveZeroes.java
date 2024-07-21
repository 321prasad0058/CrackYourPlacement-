class Solution {
    public void moveZeroes(int[] nums) {
        
       for(int i =0; i<nums.length-1; i++)
       {
       // Find next non-zero element to swap with
        if(nums[i]==0)
        {
            int j = i+1;

            while(j<nums.length && nums[j]==0)
            {
                j++;
            }
            // element found , now swap with i 
            if(j<nums.length)
            {
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        
         }
       } 
    }
  }  
