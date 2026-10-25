class Solution {
    public boolean isValid(char[][] board, int row, int col){
        if (row < 0 || col < 0 ||row >= board.length || col >= board[0].length) {
            return false;
        }
        return true;
    }

    public boolean dfs(char[][] board, String word,int row , int col ,int index , boolean[][] visited){
        if(!isValid(board,row,col)){
            return false;
        }

        if(visited[row][col]==true){
            return false;
        }

        if(board[row][col] != word.charAt(index)){
            return false;
        }

        if(index==word.length()-1){
            return true;
        }

        visited[row][col]=true;

        boolean found = dfs(board, word, row + 1, col, index + 1, visited)||
        dfs(board, word, row - 1, col, index + 1, visited) ||
        dfs(board, word, row, col + 1, index + 1, visited) ||
        dfs(board, word, row, col - 1, index + 1, visited);

        visited[row][col]=false;
        return found;
        
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        boolean [][] visited = new boolean[m][n];

        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j++){
                if(dfs(board,word,i,j,0,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}
