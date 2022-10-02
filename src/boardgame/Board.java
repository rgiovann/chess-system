package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

 
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	// retorna peça Piece na posicao r,c
	public Piece piece( int row, int column) {
		return pieces[row][column];
	}
	
	// retorna peca Piece baseado objeto Position
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getcol()];
	}
	
	public void placePiece( Piece piece, Position position) 
	{
		pieces[position.getRow()][position.getcol()] = piece;
		piece.position = position;
	}

}
