import java.util.*;

class findDuplicate
{
    public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
    int nums[] = {3,1,4,2,2};
    int duplicate = findDuplicate(nums);
    System.out.print(duplicate);
    }

    public static int findDuplicate(int[] nums)
    {
        // Solution 1
        
        // Arrays.sort(nums);  // Sorted the array

        // // Check if previous element is equal to it's consecutive element 
        // for(int i = 0; i<nums.length; i++)
        // {
        //     int j = i+1;

        //     if(nums[i]==nums[j])
        //     {
        //         return nums[i];
        //     }
        // }

        // return -1;

        // -----------------------------------------------------------------------------------------

        // Solution 2 

        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums)
        {
            if(seen.contains(num))
            {
                return num;
            }
            else
                seen.add(num);
        }
        return -1;
    }
}
