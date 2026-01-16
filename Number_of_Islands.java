import java.util.*;
class Number_of_Islands{
    public static void main(String[] args) {
       int[][] grid ={{1,0,0,0,0},{0,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};
       int count = 0;
    //    for(int[] arr : grid) System.out.println(Arrays.toString(arr));
    //    System.out.println("----------------------------");
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j] == 1){
                countIslands(grid,i,j);
                count++;
            }
        }
       }
    //    for(int[] arr : grid) System.out.println(Arrays.toString(arr));
       System.out.println("Total Number of Islands is : "+count);
    }
    public static boolean countIslands(int[][] grid,int row,int col){
        if(row == grid.length-1 && col == grid[0].length-1){
            if(grid[row][col] == 1) grid[row][col] = 0;
            return false;
        }
        if( row < 0|| row >= grid.length|| col < 0 || col>=grid[0].length || grid[row][col]== 0){
            return false;
        }
        int[] row_dir={-1,1,0,0};
        int[] col_dir ={0,0,-1,1};
        grid[row][col] = 0;
        for(int i =0;i<4;i++){
            if(countIslands(grid,row+row_dir[i],col+col_dir[i])){
                return true;
            }
        }
        return false;
    }
}