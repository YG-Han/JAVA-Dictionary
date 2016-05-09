// Programmed by YG_Han in SKKU

public class YG_Dictionary {
	public static void main(String[] args) throws Exception{
		boolean blCheckWhile = true;
		Menu dicMenu = new Menu();
		FileToHashmap.Open();
		
		do{
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
		}while(blCheckWhile);
		
		HashmapToFile.Close();
	}
}
