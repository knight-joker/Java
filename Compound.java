package k;

public class Compound {

	public static void main(String args[]){
		{
			int y = 40;
			System.out.println(y);
			int z = 245;
			boolean b;
			{
				b = y > z;
				System.out.println(b);
			}
		}
		String word = "hello";
		System.out.println(word);
	}
}

