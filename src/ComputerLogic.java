import java.util.Random;

public class ComputerLogic {

    Battleship battleship = new Battleship();

    char[][] grid = new char[4][4];

    public char[][] computerGrid(){

        for (int i = 0; i < grid.length;i++){
            System.out.println("--------");
            for (int j = 0; j < grid[i].length;j++){
                System.out.print(grid[i][j] + "|");
            }
            System.out.println();
        }
        return grid;
    }

    public void updatingShips(){

        // Assigning random values to the 2D Array
        Random random = new Random();

        for (int i = 0; i < grid.length - 1; i++) {
            int randomRow = random.nextInt(grid.length);
            int randomCol = random.nextInt(grid[0].length);

            grid[randomRow][randomCol] = 'x';
        }

    }


}//class
