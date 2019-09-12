import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
	public static void main(String[] args) {
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter("data.txt"));
			writer.write("This is string to be written");
			System.out.println("Data written");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(writer!=null) {
				try {
					writer.close();
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

}
