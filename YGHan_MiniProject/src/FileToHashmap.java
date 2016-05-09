import java.io.*;
import java.util.*;

public class FileToHashmap {
	public static HashMap<String,String> hMap = new HashMap<String,String>();
	public static File file = null;
	
	public static void Open(){
		Scanner sc = null;
		StringTokenizer sTokenizer = null;
		FileWriter fWriter = null;
		String fName = "DictionaryList.txt";
		
		try{
			file = new File(fName);
			if(file.isFile()){
				sc = new Scanner(file);
				while(sc.hasNext()){
				sTokenizer = new StringTokenizer(sc.nextLine(),":");
				hMap.put(sTokenizer.nextToken(),sTokenizer.nextToken());
				}
			}else{
				System.out.println("기존 파일이 존재하지 않습니다. 새 파일을 생성합니다.");
				fWriter = new FileWriter(file);
				fWriter.close();
			}
		}catch(IOException e){
			System.out.println("***파일불러오기 오류입니다.***");
		}
	}
}
