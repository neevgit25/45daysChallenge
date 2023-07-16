public class ExcelSheet {
    public String convertToTitle(int columnNumber) {
       StringBuilder output = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            char c = (char) (columnNumber % 26 + 'A');
            columnNumber /= 26;
            output.append(c);
        }
        // Reverse the output string
        // Bcause we have found characters from right to left...
        output.reverse();
        // Return the reversed string.
        return output.toString(); 
    }
} 
