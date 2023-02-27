/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};
*/

class Solution {

    public boolean AllValues(int [][] grid,int sr,int er,int sc,int ec){
        int val=grid[sr][sc];
        for(int i=sr;i<er;i++){
            for(int j=sc;j<ec;j++){
                if(grid[i][j]!=val){
                    return false;
                }
            }
        }
        return true;
    }

    public Node Solve(int [][]grid,int sr,int er,int sc,int ec){
        if(AllValues(grid,sr,er,sc,ec)==true){
            boolean val;
            if(grid[sr][sc]==1){
                val=true;
            }else{
                val=false;
            }
            return new Node(val,true);
        }else{
            Node node=new Node(false,false);
            int half=(er-sr)/2;
            node.topLeft=Solve(grid,sr,sr+half,sc,sc+half);
            node.topRight=Solve(grid,sr,sr+half,sc+half,ec);
            node.bottomLeft=Solve(grid,sr+half,er,sc,sc+half);
            node.bottomRight=Solve(grid,sr+half,er,sc+half,ec);
            return node;
        }
    }
    public Node construct(int[][] grid) {
        return Solve(grid,0,grid.length,0,grid.length);
    }
}