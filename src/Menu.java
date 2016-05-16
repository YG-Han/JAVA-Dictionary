import java.util.*;

public class Menu {
	Scanner sc = new Scanner(System.in);
	
	public void MenuPrint(){
		System.out.println("Menu in YG_Dictionary");
		System.out.println("1.Check a Word   2.Add a Word   3.Delete a Word  4.Check a List of Words  5.Save & Exit");
		System.out.print("Press the Number: ");
	}
	
	public String InputMenu(){
		return sc.nextLine();
	}
	
	public void CheckWord(){
		System.out.print("Enter the Word to check: ");
		String s1 = sc.nextLine();
		if(FileToHashmap.hMap.containsKey(s1)){
			System.out.println("The meaning of this word is ["+FileToHashmap.hMap.get(s1)+"].");
		}
		else{		
			System.out.println("This word is not saved.");
			System.out.println("Do you want to add it?     1.Yes  2.No");
			System.out.print("Press the Number: ");
			if(sc.nextLine().equals("1")) {
				System.out.print("Enter the meaning: ");
				FileToHashmap.hMap.put(s1, sc.nextLine());
			}
			System.out.println("This word is successfully saved.");
		}
	}
	
	public void AddWord(){
		System.out.print("Enter the Word to add: ");
		String s1 = sc.nextLine();
		if(FileToHashmap.hMap.containsKey(s1)){
			System.out.println("This word already exists.");
			System.out.println("Do you want to modify meaning?     1.Yes  2.No");
			if(sc.nextLine().equals("1")) {
				System.out.print("Enter the meaning to modify:");
				FileToHashmap.hMap.put(s1, sc.nextLine());
			}
		}
		else{
			System.out.print("Enter the meaning: ");
			FileToHashmap.hMap.put(s1, sc.nextLine());
		}
		System.out.println("This word is successfully saved.");
	}
	
	public void DeleteWord(){
		System.out.print("Enter the Word to delete: ");
		String s1 = sc.nextLine();
		if(FileToHashmap.hMap.containsKey(s1)){
			System.out.println("["+s1+"] is deleted.");
			FileToHashmap.hMap.remove(s1);
		}
		else{		
			System.out.println("This word does not exist.");
		}
	}

	public void ListWord(){
		System.out.println("This is a list of saved words.");
		TreeMap<String,String> tMap = new TreeMap<>(FileToHashmap.hMap);
		Iterator<String> treeMapIter = tMap.keySet().iterator();

		int cnt=0;
		System.out.print("[");
		while(true){
			String key= treeMapIter.next();
			System.out.print(key);
			if(!treeMapIter.hasNext()) break;
			System.out.print(", ");
			if(++cnt%10==0) System.out.println();
        }
		System.out.println("]");
	}
}
