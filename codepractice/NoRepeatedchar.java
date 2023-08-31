package codepractice;

public class NoRepeatedchar {
    public static void main(String[] args) {
		String num ="level";
		char[] c = num.toCharArray();
		int count;
		for (int i = 0; i < c.length; i++) {
			count=0;
			for (int j = 0; j < c.length; j++) {
				if (c[i]==c[j]) {
					count++;
				}			
			}
			if (count==1) {
				System.out.println(c[i]);
				//break;
			}
		}	
	}
}
