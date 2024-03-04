class Solution {
    public String convert(String s, int numRows) {
        // iterate trought the string
        //what pattern:
        /*
        3
        P   A   H   N
        A P L S I I G
        Y   I   R
        
        4
        P     I    N
        A   L S  I G
        Y A   H R
        P     I

        5
        P     H    N
        A   S   I G
        Y  I  I R
        P L
        A     I

        what if I store the chars in a 2d array?
        "PAYPALISHIRING"
         12343212343212
         where each number is the row
          edge cases are numrows = 1 and numrows > s.length

         */

        if(numRows == 1 || numRows >= s.length()){
            return s;
        }
        //keep tack of index and traversal movment:
        int currRowIndex=0, diagonal=1;
        //empty container to represent the zigzag rows
        List<Character>[] rows = new ArrayList[numRows];
        for(int i=0; i< numRows;i++){
            rows[i] = new ArrayList<>();
        }

        for(char c : s.toCharArray()){
            rows[currRowIndex].add(c);
            if(currRowIndex == 0){
                diagonal = 1;
            }else if(currRowIndex == numRows - 1){
                diagonal = -1;
            }
            currRowIndex += diagonal;
        }

        StringBuilder result = new StringBuilder();
        for(List<Character> row : rows){
            for(char c : row){
                result.append(c);
            }
        }

        return result.toString();

    }
}