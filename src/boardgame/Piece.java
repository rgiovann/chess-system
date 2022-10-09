package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	public Piece( Board board) {
		this.position = null;
		this.board = board;
	}
	public Position getPosition() {
		return position;
	}
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	// padrão de projeto: template method
	//  metodo concreto retornando um metodo abstrato implementado em 
	// outra subclasse (hook method).
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
