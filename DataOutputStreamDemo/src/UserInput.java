import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
	public static void main(String[] args) {
		BufferedReader fromUser = null;
		try {
		fromUser = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name : ");
		int name = Integer.parseInt(fromUser.readLine());
		System.out.println(name);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fromUser != null) {
				try {
				fromUser.close();
				}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			}
			
		}
	}

}
