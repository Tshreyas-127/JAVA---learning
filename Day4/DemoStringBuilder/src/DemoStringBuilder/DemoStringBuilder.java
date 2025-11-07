package DemoStringBuilder;

public class DemoStringBuilder {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder("efgh");
		System.out.println(sb.length());
		sb.insert(2,"lmn");
		System.out.println(sb);

	}

}
