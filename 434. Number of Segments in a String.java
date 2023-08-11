class Solution {
    public int countSegments(String s) {
        int count = 0;
        boolean inSegment = false;

        for (char c : s.toCharArray()) {
            if (c != ' ') {
                if (!inSegment) {
                    inSegment = true;
                    count++;
                }
            } else {
                inSegment = false;
            }
        }

        return count;
    }
}