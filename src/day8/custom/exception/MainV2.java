package day8.custom.exception;

public class MainV2 {
	public static void main(String[] args)  {
		try {
			String str = "delhi";
			
			if(str.equals("delhi")) {
				// throw new InvalidStringException("Delhi keyword is not allowed!!");
				
				// creating the exception object.
				InvalidStringException ise = new InvalidStringException("Delhi is not allowed!!");
				throw ise;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
