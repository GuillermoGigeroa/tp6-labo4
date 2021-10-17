package exceptionProject;


public class DniInvalido extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
//	Constructor

	public DniInvalido()
	{
	
	}

	
//	Metodo getMessage
	
	@Override
	public String getMessage() {
		
		return "El numero de DNI posee letras";
	}
		

}
