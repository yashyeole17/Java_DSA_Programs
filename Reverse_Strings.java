package practice;

public class Reverse_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "YASH";
		
		if(name == null)
			throw new IllegalArgumentException("Null");
		
		StringBuilder out = new StringBuilder();
		char [] ch = name.toCharArray();
		for(int  i=ch.length-1; i>= 0; i--) {
			out.append(ch[i]);
		}
		System.out.println(out.toString());
	}

}
