import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int col;
        int row;
        char[][] grid = new char[3][3];

        for (int i = 0; i < grid.length;i++){
            System.out.println("------");
            for (int j = 0; j < grid[i].length;j++){
                System.out.print(grid[i][j] + "|");
            }
            System.out.println();
        }

        System.out.println("Where do you want to place your Ship: (Use index[0][1] for example): ");
        System.out.println("What column: ");
        col = scanner.nextInt();
        System.out.println("What row: ");
        row = scanner.nextInt();

        for (int i = 0; i < grid.length;i++){
            for (int j = 0; j < grid[i].length;j++){
                if (grid[col][row] == grid[i][j]){
                    grid[i][j] = 'x';
                    for (int k = grid[col][row-1]; k <= 0; k--){
                        grid[i][j] = 'O';
                    }
                }
            }
        }

        for (int i = 0; i < grid.length;i++){
            System.out.println("------");
            for (int j = 0; j < grid[i].length;j++){
                System.out.print(grid[i][j] + "|");
            }
            System.out.println();
        }



    }
}//class
