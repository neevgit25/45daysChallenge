class ReverseWord {
    public String reverseWords(String s) {
     // Trim the input string to remove leading and trailing spaces
        String[] word = s.trim().split("\\s+");

        String out = "";
        
        for (int i = word.length - 1; i > 0; i--) { 
            // Append the current word and a space to the output
            out += word[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        return out + word[0]; 
    }
}
