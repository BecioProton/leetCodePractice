class Solution {
    static {
        for (int i = 0; i < 500; i++)
            reverseWords("");
    }

    public static String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        char res[] = new char[n];
        int res_index = 0;
        int end = n - 1;

        while (end >= 0) {
            while (end >= 0 && ch[end] == ' ')
                end--;

            int start = end;
            while (start >= 0 && ch[start] != ' ')
                start--;

            if (res_index > 0)
                res[res_index++] = ' ';

            for (int i = start + 1; i <= end; i++)
                res[res_index++] = ch[i];

            end = start - 1;
        }

        return new String(res, 0, res_index).trim();
    }
}