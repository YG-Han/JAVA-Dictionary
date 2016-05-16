// Programmed by YG_Han in SKKU
// 2016.05.07~

public class YG_Dictionary {
	public static boolean blCheckWhile = true;	//To error by FileOpen or put the exit menu break the While loop.

	public static void main(String[] args) throws Exception{
		Menu dicMenu = new Menu();
		FileToHashmap.Open(); //File Open

		while(blCheckWhile){
			System.out.println("\n***********************************************************************************");
			dicMenu.MenuPrint();
			switch(dicMenu.InputMenu()){
			case "1":
				dicMenu.CheckWord();
				break;
			case "2":
				dicMenu.AddWord();
				break;
			case "3":
				dicMenu.DeleteWord();
				break;
			case "4":
				dicMenu.ListWord();
				break;
			case "5":
				System.out.println("\nTo exit this program \nThank you \nby YG_Han \n\n");
				blCheckWhile = false;
				break;
			default:
				System.out.println("Invalid enter, please re-press the Number.");
			}
			System.out.println("***********************************************************************************\n");
		}
		
		HashmapToFile.Close(); //File save&close
	}
}
