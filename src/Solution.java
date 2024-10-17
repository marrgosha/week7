import java.util.Arrays;

class Solution {
    public static void main(String[]args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = {0,1,2,3,4,0,0,0,0,0};
        int[] result = removeDuplicates(nums);


    }
    public static int [] removeDuplicates(int[] nums){
        int [] temp = new int [10];
        int j=0;
        for (int i=0; i<nums.length-1; i++){
            if (nums[i]!=nums[i+1]){
                    temp [j++]= nums[i];

            }
            temp [j++]=nums[9];


            System.out.println(temp[j]);

        }
        return temp;


    }
}
