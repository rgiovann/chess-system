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

	public int getColumn() {
		return col;
	}

	public void setcol(int col) {
		this.col = col;
	}

	@Override
	public String toString() {
		return row + ", " + col;
	}

}
