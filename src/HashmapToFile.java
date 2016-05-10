import java.io.*;
import java.util.ArrayList;

public class HashmapToFile {
	public static void Close(){
		ArrayList<String> aList = new ArrayList<String>();
		FileWriter fWriter = null;
		aList.addAll(FileToHashmap.hMap.keySet());
		try{
			fWriter = new FileWriter(FileToHashmap.file);
			for(int i=0; i<aList.size(); i++){
				fWriter.write(aList.get(i));
				fWriter.write(":");
				fWriter.write(FileToHashmap.hMap.get(aList.get(i)));
				fWriter.write("\n");
			}
			fWriter.close();
		}catch(IOException e){
			System.out.println("***error by saving file.***");
		}
	}
}
