package phase1.project;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class appendtofile {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Rocket.txt");
		String data = "Data is appended";
		try {
		
		FileWriter writer = new FileWriter("file.txt", true);
		writer.write(data);
		System.out.println("Data appended");
		writer.close();
	} catch (IOException e) {
		System.out.println("File has an error");
	}

}

}
