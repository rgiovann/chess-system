package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public Program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		
		while(true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());	
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			}
			catch(ChessException e) {                  // erro de dominio 
				System.out.println(e.getLocalizedMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e) {         // erro de tipo de entrada de dados
				System.out.println(e.getLocalizedMessage());
				sc.nextLine();
			}
						
			
		}

	}

}
