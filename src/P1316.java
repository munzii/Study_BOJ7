import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P1316 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count =0;
		String a[] = new String[n];
		boolean c[] = new boolean[26];
		
		for(int i=0; i<n; i++) {
			a[i] = br.readLine();
		}
		
		for(int i=0; i<a.length; i++) {
			count++;
			Arrays.fill(c, false);
			for(int j=0; j<a[i].length(); j++) {
				if(j!=a[i].length()-1 && c[a[i].charAt(j)-97] == false && a[i].charAt(j)!= a[i].charAt(j+1)) {
					c[a[i].charAt(j)-97] = true;
				}
				else if(c[a[i].charAt(j)-97]== true) {
					count-=1;
					break;
				}
			}
		}
		bw.write(String.valueOf(count));
		
		br.close();
		bw.flush();
		bw.close();

	}

}