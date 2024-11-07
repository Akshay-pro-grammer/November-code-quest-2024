//2275 - Largest Combination With Bitwise AND Greater Than Zero
//in this problem we have to take a combination of elements from the array and return the size of the max and
//now combinations are 2^n we dont want that
//so we will use a better approach
//if we assume the binary representation as a array of 32 size
///then we will make all the number in that form and add it to their respective position in the array
//at a point , the max combination will be the max element in the index
class Solution {
    public int largestCombination(int[] candidates) {
        //the 32 size array
        int arr[]= new int[32];
        //for each element in candidates
        for(int el:candidates){
            //count=0
            int count=0;
            //this is the index used to traverse the arr
            int i=0;
            while(el>0){
                //take the last bit and add it to the array
                arr[i] += (1 & el);
                i++;
                //move to next bit
                el=el>>1;
            }
        }
        //return the max 
        return Arrays.stream(arr).max().getAsInt();
    }
}
