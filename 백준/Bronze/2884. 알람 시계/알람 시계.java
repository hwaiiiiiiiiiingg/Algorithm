import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int H = input.nextInt();
		int M = input.nextInt();
		
		if(M<45) {
			if(H > 23) H -= 24;
			else if(H == 0) H = 23;
			else H -= 1;
			M = M + 60 - 45;
		}else {
			M -= 45;
		}
		
		System.out.println(H+" "+M);
	}

}
