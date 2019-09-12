
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) {
		ObjectOutputStream stream=null;
		ObjectInputStream istream=null;
		try {
			stream=new ObjectOutputStream(new FileOutputStream("stringobj"));
			stream.writeObject(new Student("sadasd",12,"safsaf"));
			istream=new ObjectInputStream(new FileInputStream("stringobj"));
			System.out.println(istream.readObject());
		}
		catch(IOException |ClassNotFoundException e) {
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