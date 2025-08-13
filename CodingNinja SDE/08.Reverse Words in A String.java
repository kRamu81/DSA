public class Solution 
{
    public static String reverseString(String str) 
    {
        // Split the string by spaces
        str = str.trim();
        String[] word = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        int n = word.length;
        
        // Append words in reverse order
        for(int i = n - 1; i >= 0; i--) {
            sb.append(word[i]);
            if(i != 0) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}
