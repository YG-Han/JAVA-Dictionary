// Programmed by YG_Han in SKKU
// 2016.05.07~

public class YG_Dictionary {
	public static boolean blCheckWhile = true;	//To errored by FileOpen or put the exit menu break the While loop.
	public static void main(String[] args) throws Exception{
		Menu dicMenu = new Menu();
		FileToHashmap.Open();

		while(blCheckWhile){
			System.out.println();
			System.out.println("*********************************************************************************");
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
			default:		
			}
			System.out.println("*********************************************************************************");
		}
		
		HashmapToFile.Close();
	}
}
