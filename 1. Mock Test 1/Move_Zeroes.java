/**
Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

Constraints:
a. 1 <= nums.length <= 10^4
b. -2^31 <= nums[i] <= 2^31 - 1
 */
public class Move_Zeroes {

    public void moveZeroes(int[] arr) {
        int j = 0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }

        while(j<arr.length) {
            arr[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 0, 3, 12};
        Move_Zeroes m0 = new Move_Zeroes();
        m0.moveZeroes(arr);
        for (int i=0; i<arr.length; i++) {
            
            System.out.print(arr[i] + " "); 
        }
    }
}