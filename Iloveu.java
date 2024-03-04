import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Iloveu {

	public static void main(String[] args) {
		
		String urfilepath = "C:\\USERS\\PCC\\DESKTOP";
		String content = "I love you";
		
		createNotepadFile(urfilepath, content);
		
	}

	
	public static void createNotepadFile(String urfilepath, String content) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(urfilepath))){
			writer.write(content);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
