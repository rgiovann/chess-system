package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board(int rows, int columns) {
		if( rows < 1 || columns < 1) 
		{
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column.");
		}
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	public int getColumns() {
		return columns;
	}

	public int getRows() {
		return rows;
	}
	
	// retorna peça Piece na posicao r,c
	public Piece piece( int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Error placing piece: position not on the board.");
		}
		return pieces[row][column];
	}
	
	// retorna peca Piece baseado objeto Position
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Error placing piece: position not on the board.");
		}		
		return pieces[position.getRow()][position.getcol()];
	}
	
	public void placePiece( Piece piece, Position position) 
	{
		if(thereIsAPiece(position)) 
		{
			throw new BoardException("Error placing piece: there is already a piece on position "+ position);			
		}
		pieces[position.getRow()][position.getcol()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >=0 && column < columns ;
		
	}
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(),position.getcol());
		
	}
	
	public boolean thereIsAPiece(Position position)
	{
		if(!positionExists(position)) {
			throw new BoardException("Error placing piece: position not on the board.");
		}				
		return piece(position) != null;
	}	

}
