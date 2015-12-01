package MainPackage;

public class InsufficientFundsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double account;
	   
	   public InsufficientFundsException(double account)
	   {
	      this.account = account;
	   } 
	   public double getAccount()
	   {
	      return account;
	   }
}