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

	public void setColumn(int col) {
		this.col = col;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.col = column;
	}

	@Override
	public String toString() {
		return row + ", " + col;
	}

}
