import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader3000{
	public static void main(String[] args) throws IOException {
	
		File file=new File("C:\\Users\\admin\\Desktop/bla.txt");
		Scanner scan=new Scanner(file);
		String fileContent="";
		while(scan.hasNextLine()) {
		fileContent=fileContent.concat(scan.nextLine()+"\n");
		}
		FileWriter writer=new FileWriter("C:\\Users\\admin\\Desktop/newfile.txt");
		writer.write(fileContent);
		writer.close();
		
	}
}
