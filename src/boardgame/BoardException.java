package boardgame;

public class BoardException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BoardException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
    public BoardException(String message, Throwable cause) {
        super(message, cause);
    }	


 
}
