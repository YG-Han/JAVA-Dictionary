import java.util.*;

public class Menu {
	Scanner sc = new Scanner(System.in);
	
	public void MenuPrint(){
		System.out.println("YG_Dictionary 메뉴입니다.");
		System.out.println("1.단어 확인   2.단어 추가   3.단어 삭제  4.목록 확인  5.저장&종료");
		System.out.print("메뉴를 입력해주세요: ");		
	}
	
	public String InputMenu(){
		return sc.nextLine();
	}
	
	public void CheckWord(){
		System.out.print("확인할 단어의 뜻을 입력하세요: ");
		String s1 = sc.nextLine();
		if(FileToHashmap.hMap.containsKey(s1)){
			System.out.println("입력하신 단어의 뜻은: ["+FileToHashmap.hMap.get(s1)+"] 입니다.");
		}
		else{		
			System.out.println("단어가 존재하지 않습니다.");
		}
		System.out.println();
		System.out.println();
	}
	
	public void AddWord(){
		System.out.print("추가할 단어를 입력하세요: ");
		String s1 = sc.nextLine();
		if(FileToHashmap.hMap.containsKey(s1)){
			System.out.println("이미 존재하는 단어입니다. 수정할 뜻을 입력하세요.");
			FileToHashmap.hMap.put(s1, sc.nextLine());
		}
		else{
			System.out.print("단어의 뜻을 입력하세요: ");
			FileToHashmap.hMap.put(s1, sc.nextLine());
		}
		System.out.println("단어가 추가되었습니다.");
		System.out.println();
	}
	
	public void DeleteWord(){
		System.out.print("삭제할 단어를 입력하세요: ");
		String s1 = sc.nextLine();
		if(FileToHashmap.hMap.containsKey(s1)){
			System.out.println("["+s1+"] 삭제되었습니다.");
			FileToHashmap.hMap.remove(s1);
		}
		else{		
			System.out.println("해당 단어가 존재하지 않습니다.");
		}
		System.out.println();
		System.out.println();
	}
	public void ListWord(){
		System.out.println("저장된 단어들의 목록을 불러옵니다.");
		System.out.println(FileToHashmap.hMap.keySet());
	}
}
