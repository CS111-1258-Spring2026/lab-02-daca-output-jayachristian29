// PARTNER NAME: Jaya Eckert
// PARTNER NAME:
// CS111 SECTION #: 1285
// DATE: 02/04/2026

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surname = "SPECIMEN";
		String givenname = "TEXT V";
		String uscisNumber = "000-000-725";
		String category = "C09";
		String cardNumber = "SRC0000000725";
		String countryOB = "Ethiopia";
		String termConditions = "NONE";
		String dateOB = "01 JAN 1920";
		String sex = "M";
		String validFrom = "01/01/80";
		String cardExpires = "05/10/11";
		
		//INPUT SECTION
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       "+ surname );
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    "+ givenname );
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          "+ uscisNumber +"    "+ category +"        "+ cardNumber );
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      "+ countryOB );
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       "+ termConditions );
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         "+ dateOB +"     "+ sex);
		System.out.println("║                       Valid From:     "+ validFrom );
		System.out.println("║                       Card Expires:   "+ cardExpires );
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}