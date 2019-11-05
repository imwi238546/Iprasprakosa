import java.util.Scanner;

public class Looping {
public static void main(String[] args) {
		
	String nama;
	int umur =0;
	float tinggi;
	char jeniskelamin;
	
	Scanner input = new Scanner(System.in);
	
	int x;
	x = input.nextInt();
	
		for(int i=0;i<=100;i++) {
			if(i%x==0) {
				System.out.println(i);
			}
			
		//System.out.println(i+1 + "*" + x + "=" + (i+1) * x);
		
		
		
	}
	
	
}
}
