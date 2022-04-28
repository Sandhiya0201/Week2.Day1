package Week2.Day1;

public class CharOccu {
	public static void main(String[]args) {
		String str = "welcome to Bangalore";
		int count=0;
		for(char ch:str.toCharArray()) {
			if(ch=='e')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
