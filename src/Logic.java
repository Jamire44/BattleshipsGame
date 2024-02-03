import java.util.Scanner;

public class Logic {

    public Logic() {

    }

    char[][] grid = new char[4][4];
    int col;
    int row;

    public char[][] Grid(){

        for (int i = 0; i < grid.length;i++){
            System.out.println("--------");
            for (int j = 0; j < grid[i].length;j++){
                System.out.print(grid[i][j] + "|");
            }
            System.out.println();
        }
        return grid;
    }

    public void whereShipsWantToBePlaces(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where do you want to place your Ship: (Use index[0][1] for example): ");
        System.out.println("What column: ");
        col = scanner.nextInt();
        System.out.println("What row: ");
        row = scanner.nextInt();

        if (col < 0 || col > grid.length){
            System.out.println("Enter a valid input: ");
            System.out.println("What column: ");
            col = scanner.nextInt();
        }

        if (row < 0 || col > grid.length){
            System.out.println("Enter a valid input:");
            System.out.println("What row: ");
            row = scanner.nextInt();
        }

    }

    public void updatingShips(){

        for (int i = 0; i < grid.length - 1;i++){
            for (int j = 0; j < grid[i].length;j++){

                if(row == 0){
                    grid[grid[i][j]][grid[i-1][j]] = 'x';
                }

                if (grid[col][row] == grid[i][j]){
                    grid[i][j] = 'x';
                    for (int k = grid[col][row-1]; k <= 0; k--){
                        grid[i][j] = 'O';
                    }
                }
            }
        }
    }





}//class
