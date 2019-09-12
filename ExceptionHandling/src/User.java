
public class User {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException{
		if(age<18) {
			throw new AgeException("age is low");
		}
		else {
			age =0;
		}
	}
	
	public static void main(String[] args) {
		User user = new User();
		try {
			user.setAge(12);
		}catch(AgeException e) {
			e.printStackTrace();
		}
		System.out.println(user.getAge());
	}
	
	
	

}
