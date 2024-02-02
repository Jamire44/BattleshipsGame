public class Battleship {
    public static void main(String[] args) {

        int[][] grid = new int[3][3];

        for (int i = 0; i < grid.length;i++){
            System.out.println("------");
            for (int j = 0; j < grid[i].length;j++){
                System.out.print(grid[i][j] + "|");
            }
            System.out.println();
        }
    }
}//class
