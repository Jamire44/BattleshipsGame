import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {

        final int numberOfShips = 3;

        Logic logic = new Logic();

        for (int i = 0; i < numberOfShips; i++){
            logic.Grid();
            logic.whereShipsWantToBePlaces();
            logic.updatingShips(); 
        }

    }
}//class


