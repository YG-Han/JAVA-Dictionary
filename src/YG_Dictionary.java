// Programmed by YG_Han in SKKU

public class YG_Dictionary {
	public static boolean blCheckWhile = true;
	public static void main(String[] args) throws Exception{
		Menu dicMenu = new Menu();
		FileToHashmap.Open();
		
		while(blCheckWhile){
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
				System.out.println("\nTo end this program \nThank you \nby YG_Han \n\n");
				blCheckWhile = false;
			default:		
			}
		}
		
		HashmapToFile.Close();
	}
}
