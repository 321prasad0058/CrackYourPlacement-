import java.util.*;

class sortColors
{
    public static void main(String[] args)
    {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        for(int i =0 ; i<nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }

    public static void sortColors(int[] nums)
    {
        int cnt1 =0, cnt2 = 0, cnt3 = 0;

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]==0)
                cnt1++;
            else if(nums[i]==1)
                    cnt2++;
            else    
                cnt3++;            
        }


        for(int i = 0; i<cnt1; i++)
        {
            nums[i]=0;
        }

        for(int i = cnt1; i<cnt1+cnt2; i++)
        {
            nums[i]=1;
        }

        for(int i = cnt1+cnt2; i<nums.length; i++)
        {
            nums[i]=2;
        }
    }
}