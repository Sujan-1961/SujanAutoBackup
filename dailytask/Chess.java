package dailytask;
import java.util.Scanner;
public class Chess {
	   private static final int BOARD_SIZE = 8;

	    private static char[][] board;
	    private static boolean whiteTurn = true;
	    private static Scanner scanner;

	    public static void main(String[] args) {
	        board = new char[BOARD_SIZE][BOARD_SIZE];
	        scanner = new Scanner(System.in);

	        initializeBoard();
	        printBoard();

	        while (true) {
	            if (isGameOver()) {
	                System.out.println("Game Over!");
	                break;
	            }

	            System.out.println((whiteTurn ? "White" : "Black") + "'s turn. Enter your move (e.g., e2 e4): ");
	            String move = scanner.nextLine();

	            if (!isValidMove(move)) {
	                System.out.println("Invalid move. Try again.");
	                continue;
	            }

	            executeMove(move);
	            printBoard();
	            whiteTurn = !whiteTurn;
	        }

	        scanner.close();
	    }

	    private static void initializeBoard() {
	        // Fill the board with starting positions of pieces
	        for (int i = 0; i < BOARD_SIZE; i++) {
	            board[i][1] = 'P';
	            board[i][6] = 'p';
	        }

	        board[0][0] = board[7][0] = 'R';
	        board[1][0] = board[6][0] = 'N';
	        board[2][0] = board[5][0] = 'B';
	        board[3][0] = 'Q';
	        board[4][0] = 'K';

	        board[0][7] = board[7][7] = 'r';
	        board[1][7] = board[6][7] = 'n';
	        board[2][7] = board[5][7] = 'b';
	        board[3][7] = 'q';
	        board[4][7] = 'k';
	    }

	    private static void printBoard() {
	        System.out.println("  a b c d e f g h");
	        for (int row = 0; row < BOARD_SIZE; row++) {
	            System.out.print((8 - row) + " ");
	            for (int col = 0; col < BOARD_SIZE; col++) {
	                char piece = (board[col][row] == 0) ? ' ' : board[col][row];
	                System.out.print(piece + " ");
	            }
	            System.out.println();
	        }
	    }

	    private static boolean isValidMove(String move) {
	        // Validate move format
	        if (!move.matches("[a-h][1-8] [a-h][1-8]")) {
	            return false;
	        }

	        int fromX = move.charAt(0) - 'a';
	        int fromY = '8' - move.charAt(1);
	        int toX = move.charAt(3) - 'a';
	        int toY = '8' - move.charAt(4);

	        // Validate piece movement rules (not implemented in this simplified version)
	        return true;
	    }

	    private static void executeMove(String move) {
	        int fromX = move.charAt(0) - 'a';
	        int fromY = '8' - move.charAt(1);
	        int toX = move.charAt(3) - 'a';
	        int toY = '8' - move.charAt(4);

	        board[toX][toY] = board[fromX][fromY];
	        board[fromX][fromY] = 0;
	    }

	    private static boolean isGameOver() {
	        // Check if the game is over (not implemented in this simplified version)
	        return false;
	    }
	}


