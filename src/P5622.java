import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P5622 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String n = br.readLine();
		int sum=0;
		
		for(int i=0; i<n.length(); i++) {
			char c = n.charAt(i);
			if(c == '0') {
				sum+=11;
			}
			else if(c =='1') {
				sum+=2;
			}
			else {
				sum+= second(c) +1;
			}
		}
		bw.write(String.valueOf(sum));
		
		br.close();
		bw.flush();
		bw.close();

	}
	
	public static int second(char c) {
		int num = 0;
		switch(c) {
			case 'A' :
			case 'B' :
			case 'C' :
				num = 2;
				break;
			case 'D' :
			case 'E' :
			case 'F' :
				num = 3;
				break;
			case 'G' :
			case 'H' :
			case 'I' :
				num = 4;
				break;
			case 'J' :
			case 'K' :
			case 'L' :
				num = 5;
				break;
			case 'M' :
			case 'N' :
			case 'O' :
				num = 6;
				break;
			case 'P' :
			case 'Q' :
			case 'R' :
			case 'S' :
				num = 7;
				break;
			case 'T' :
			case 'U' :
			case 'V' :
				num = 8;
				break;
			case 'W' :
			case 'X' :
			case 'Y' :
			case 'Z' :
				num = 9;
				break;
			default :
				break;
		}
		return num;
	}

}