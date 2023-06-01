class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);

        triangle.add(firstRow);

        for(int i=1;i<numRows;i++){
            List<Integer> prevRow = triangle.get(i-1);
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1);

            for(int j=1;j<i;j++){
                currentRow.add(prevRow.get(j-1)+prevRow.get(j));
            }

            currentRow.add(1);
            triangle.add(currentRow);
        }
    return triangle;
    }
}