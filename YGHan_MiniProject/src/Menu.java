import java.util.*;

public class Menu {
	Scanner sc = new Scanner(System.in);
	
	public void MenuPrint(){
		System.out.println("Menu in YG_Dictionary");
		System.out.println("1.Check Word   2.Add Word   3.Delete Word  4.Check List  5.Save&End");
		System.out.print("Press the Number: ");
	}
	
	public String InputMenu(){
		return sc.nextLine();
	}
	
	public void CheckWord(){
		System.out.print("Enter the Word to check: ");
		String s1 = sc.nextLine();
		if(FileToHashmap.hMap.containsKey(s1)){
			System.out.println("The means of this word is ["+FileToHashmap.hMap.get(s1)+"].");
		}
		else{		
			System.out.println("This word is not saved.");
		}
		System.out.println();
		System.out.println();
	}
	
	public void AddWord(){
		System.out.print("Enter the Word to add: ");
		String s1 = sc.nextLine();
		if(FileToHashmap.hMap.containsKey(s1)){
			System.out.println("This word already exists. Enter the means to modify.");
			FileToHashmap.hMap.put(s1, sc.nextLine());
		}
		else{
			System.out.print("Enter the means: ");
			FileToHashmap.hMap.put(s1, sc.nextLine());
		}
		System.out.println("This word is added.");
		System.out.println();
	}
	
	public void DeleteWord(){
		System.out.print("Enter the Word to delete: ");
		String s1 = sc.nextLine();
		if(FileToHashmap.hMap.containsKey(s1)){
			System.out.println("["+s1+"] is deleted");
			FileToHashmap.hMap.remove(s1);
		}
		else{		
			System.out.println("This word does not exist.");
		}
		System.out.println();
		System.out.println();
	}
	public void ListWord(){
		System.out.println("This is a list of saved words.");
		System.out.println(FileToHashmap.hMap.keySet());
	}
}
