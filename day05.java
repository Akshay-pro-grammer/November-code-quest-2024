// 2914 - Minimum Numbrt of Changes to Make Binary String Beautiful
//the problem statement states that we have to make partitions 
//the partition can be 1 or more of even length
//each partition can only have same characters
//here the string length is even as per constraints
//we can divide it into 2 substrings but those needs to be even
//so we have to divide it in such a way that the substring length is even because dividing by 2 can lead to odd number
//so case 1 : the divded Substring length is even, then we can further divide it into 2 in the end we will reach a string length of 2// we will stop here
//so case 2 : if odd then then we will not divide by 2 , the original string must be partitioned in such a way that the length is even
//so we reach to a conclusion that the string length 2 is the minimum we can take 
class Solution {
    public int minChanges(String s) {
        int n=s.length();
        int count=0;
        //for each 2 consequtive characters
        for(int i=0;i<n-1;i=i+2){
            //if they are not equal that means one of them needs to be switched
            if(s.charAt(i)!=s.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
}
