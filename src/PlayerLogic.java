import java.util.Scanner;

public class PlayerLogic {

    public PlayerLogic() {

    }

    char[][] grid = new char[4][4];
    private int col;
    private int row;
    private int colShot;
    private int rowShot;

    ComputerLogic computerLogic = new ComputerLogic();

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

        for (int i = 0; i < 3; i++) {
            System.out.println("Where do you want to place your Ship: (Use index[0][1] for example): ");
            System.out.println("What row: ");
            row = scanner.nextInt();
            System.out.println("What column: ");
            col = scanner.nextInt();

            if (col < 0 || col > grid.length) {
                System.out.println("Enter a valid input: ");
                System.out.println("What row: ");
                row = scanner.nextInt();
            }

            if (row < 0 || row > grid.length) {
                System.out.println("Enter a valid input:");
                System.out.println("What col: ");
                col = scanner.nextInt();
            }
        }
    }

    public void updatingShips(){

        for (int i = 0; i < grid.length;i++){
            for (int j = 0; j < grid[i].length;j++){

                if (grid[row][col] == grid[i][j]){
                    grid[i][j] = 'x';
                    for (int k = grid[row][col]; k <= 0; k--){
                        grid[i][j] = 'O';
                    }
                }
            }
        }
    }

    public void promptingWithReply(int numberOfShips){
        for (int i = 0; i < numberOfShips; i++){
            Grid();
            whereShipsWantToBePlaces();
            updatingShips();
        }
    }
    public void whereToFirePrompt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where do you want to place your Shot: (Use index[0][1] for example): ");
        System.out.println("What column: ");
        colShot = scanner.nextInt();
        System.out.println("What row: ");
        rowShot = scanner.nextInt();
    }

    public void ifShotHit(){

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j  < grid[i].length; j++){
                if (grid[i][j] == 'c'){

                }
            }

        }
    }





}//class
