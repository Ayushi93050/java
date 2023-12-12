import java.lang.String;
public class InsufficientFundsException extends Exception{

	public InsufficientFundsException(String message){
		super(message);
	}

}