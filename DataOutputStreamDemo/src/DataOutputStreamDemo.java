
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
	public static void main(String[] args) {
		DataOutputStream stream=null;
		DataInputStream istream=null;
		try {
			stream=new DataOutputStream(new FileOutputStream("datafilewrite"));
			stream.writeUTF("asfasfsafsafsafa");
			istream=new DataInputStream(new FileInputStream("datafilewrite"));
			System.out.println(istream.readUTF());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(stream!=null) {
				try {
					stream.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(istream!=null) {
				try {
					istream.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
