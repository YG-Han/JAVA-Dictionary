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
				System.out.println("The original file does not exist. Create new file.");
				fWriter = new FileWriter(file);
				fWriter.close();
			}
		}catch(IOException e){
			System.out.println("***error by loading file.***");
			YG_Dictionary.blCheckWhile = false;
		}
	}
}
