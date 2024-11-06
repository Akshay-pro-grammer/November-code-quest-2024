//3011 - Find if Array can be sorted
//we will go according to the hints which says that if we somehow group them into same bit numbers
//then for a particular group we take the the max value and the min value
//here the array does not need to be sorted because if we encounter a same bit we encountered before we will justmake another group
//since we can only have adjacent swapping
class Solution {
    public static boolean canSortArray(int[] nums) {
        //initialize variables
        int previousMaxValue = 0, currentMinValue = 0, currentMaxValue = 0;
        int previousBitCount = 0;
        //for each element
        for (int value : nums) {
            //count the number of 1s in the number
            int currentBitCount = Integer.bitCount(value);
            //if the previous bit count is equal that means they are of same group
            if (previousBitCount == currentBitCount) {
                //if they are of same group then we find out whos max whos min
                currentMinValue = Math.min(currentMinValue, value);
                currentMaxValue = Math.max(currentMaxValue, value);
                
            }
            //now here if the bits are not equal we will skip becuase they fall in the same group
            //else if previos max value is not greater then current min value , it cannot be sorted
            else if (currentMinValue < previousMaxValue) {
                return false;
            }
            //else case we update the variables
             else {
                //current becomes prev
                previousMaxValue = currentMaxValue;
                //the value becomes current min as well as current amx
                currentMinValue = currentMaxValue = value;
                //currr bit count becomes prev
                previousBitCount = currentBitCount;
            }
        }
        // the last value should be greater than previous max value
        return currentMinValue >= previousMaxValue;
    }
}
