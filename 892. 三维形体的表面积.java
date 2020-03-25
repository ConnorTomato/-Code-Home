class Solution {
   public int surfaceArea(int[][] grid) {
        if(grid.length == 0)
            return 0;
        if(grid[0].length == 0)
            return 0;
        int sum = 0;
        int verticalOverlap = 0;
        int rowOverlap = 0;
        int colOverlaop = 0;
        for(int i = 0 ; i< grid.length;i++){
            for(int j = 0; j < grid[0].length; j++){
                sum += grid[i][j];
                if(grid[i][j] > 0){
                    verticalOverlap +=(grid[i][j]-1);
                }
                if(j > 0){
                    rowOverlap  +=Math.min(grid[i][j-1],grid[i][j]);
                }
                if(i > 0){
                    colOverlaop +=Math.min(grid[i-1][j],grid[i][j]);
                }
            }
        }
        return  sum*6-(verticalOverlap+rowOverlap+colOverlaop)*2;
}
}
