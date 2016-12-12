
public class Login {



	private boolean angemeldet=false;
	private String [][] dataString = {{"khaled","khaled-pass"},{"k1","k2"}};
	
	
	
	
	public void anmelden (String benutzer, String passwort) throws ZugriffUngueltigException{
		while (angemeldet==false) {
			
		
		for (int  i= 0;  i<dataString.length; i++) {
			if (benutzer.equals(dataString[i][0])) {
				if (passwort.equals(dataString[i][1])) {
					angemeldet=true;
					continue;
				}
			}
			
		}
		break;
		}
		if (angemeldet==true) {
			
		}else if(angemeldet== false){

			throw new ZugriffUngueltigException("User name or password is wrong !!");

		}
		
	}
	public void abmelden()  {
		angemeldet=false;
	}
	public void bearbeiten() throws KeineBerechtigungException{
		if (angemeldet==true) {
			System.out.println("It's working !!!");

		}else if (angemeldet==false) {
			throw new KeineBerechtigungException("You can not use this method without logging in .");

		}
	}
}
