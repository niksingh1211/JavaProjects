import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		try(FileOutputStream stream = new FileOutputStream("filewrite",true);
				DataOutputStream dataOutputStream = new DataOutputStream(stream)){
			String str = "This string is to be written.";
			byte b[]=str.getBytes();
			stream.write(b);
			System.out.println("data written");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
