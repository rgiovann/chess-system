package chess;

import boardgame.Position;

public class ChessPosition {
	private char column;
	private int row;
	// lanço uma ChessException por estar fora do domínio do tabuleiro de xadrez,
	// try catch pega essa Exception ao solicitar source/target inputs.
	public ChessPosition(char column,int row) {
		if( column < 'a' || column >'h' || row < 1 || row >8) {
			throw new ChessException("Values out of allowed domain. Allowed values are column [a...h] and row [1...8]");
		}
		this.column = column;
		this.row = row;
		 
	}
	public char getColumn() {
		return column;
	}
 
	public int getRow() {
		return row;
	}
 
	protected Position toPosition() 
	{
	return new Position( 8-row,column - 'a' );
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition( (char) ('a'+position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString()
	{
		return "" + column + row;
	}
}
