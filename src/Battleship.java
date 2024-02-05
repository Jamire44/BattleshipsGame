public class Battleship {
    public static void main(String[] args) {

        final int numberOfShips = 3;

        PlayerLogic playerLogic = new PlayerLogic();
        ComputerLogic computerLogic = new ComputerLogic();


//        playerLogic.promptingWithReply(numberOfShips);
//        computerLogic.computerGrid();
//        System.out.println();
//        computerLogic.updatingShips();
//        computerLogic.computerGrid();

        playerLogic.Grid();
        playerLogic.whereShipsWantToBePlaces();
        playerLogic.updatingShips();
        playerLogic.Grid();

    }
}//class


