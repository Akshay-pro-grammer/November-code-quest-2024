//3163 - String Compression iii
//very straigfoward question
class Solution {
    public String compressedString(String word) {
        //we are using this because String takes a lot of memory
        StringBuilder s1 = new StringBuilder();
        //the snapshot of length of string
        int n = word.length();
        //index
        int i = 0;
        while (i < n) {
            //take the current char 
            char currentChar = word.charAt(i);
            //the word count
            int count = 0;

            // Count up to 9 for consecutive identical characters
            while (i < n && word.charAt(i) == currentChar && count < 9) {
                count++;
                i++;
            }

            // Append the count and character it handles both 9 and greater
            s1.append(count).append(currentChar);
        }
        //to string
        return s1.toString();
    }
}
