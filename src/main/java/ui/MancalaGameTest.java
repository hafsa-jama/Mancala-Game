/*package ui;

import java.util.Scanner;
import mancala.MancalaGame;
import mancala.Player;
import mancala.Store;
import mancala.Pit;
import mancala.Saver;
import mancala.KalahRules;
import mancala.UserProfile;
import mancala.MancalaDataStructure;
import mancala.MancalaGame.GameType;
import mancala.PitNotFoundException;
import mancala.InvalidMoveException;
import mancala.GameNotOverException;


public class MancalaGameTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MancalaGame game = new MancalaGame(MancalaGame.GameType.KALAH);

        // Initialize players
        Player playerOne = new Player("Player 1");
        Player playerTwo = new Player("Player 2");
        game.setPlayers(playerOne, playerTwo);

        game.startNewGame();

        while (!game.isGameOver()) {
            System.out.println(game);
            System.out.println("Current Player: " + game.getCurrentPlayer().getName());

            System.out.print("Choose a pit to move stones from (1-6): ");
            int pit = scanner.nextInt();

            try {
                game.move(pit);
            } catch (InvalidMoveException e) {
                System.out.println("Invalid move. Try again.");
                continue;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            }

            System.out.println("Moved stones from pit " + pit);
        }

        try {
            Player winner = game.getWinner();
            if (winner != null) {
                System.out.println("Winner: " + winner.getName());
            } else {
                System.out.println("The game is a draw.");
            }
        } catch (GameNotOverException e) {
            System.out.println("The game is not over yet.");
        }

        scanner.close();
    }
}*/