import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		int[] arr = new int[26];
		String a = br.readLine().toUpperCase();
		int max = -1;
		char s = '?';
		
		for(int i=0; i<a.length(); i++) {
			arr[a.charAt(i)-65]++;
			if(max<arr[a.charAt(i)-65]) {
				max=arr[a.charAt(i)-65];
				s=a.charAt(i);
			}
			else if(max==arr[a.charAt(i)-65]) {
				s = '?';
			}
		}
		bw.write(String.valueOf(s));
		
		br.close();
		bw.flush();
		bw.close();

	}

}