package boardgame;

public class Position {
	private int row;
	private int col;

	public Position(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getcol() {
		return col;
	}

	public void setcol(int col) {
		this.col = col;
	}

	public Position() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return row + ", " + col;
	}

}
