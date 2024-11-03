//796 - Rotate String
//simple question
// this question is about rotating string, that means you have a string s, 
// you take the last character of this string and add it to the first ,
// check if its equal to goal or not. and continue
//but eventually we will reach the original string again
//so we cna just concatinate the string twice 
//that will have all the possible combinations a rotated string can have and we can just use the inbuilt contains method to check
//thats literally O(1) solution
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String str=s+s;
        if(str.contains(goal)){
            return true;

        }
        return false;
    }

}
