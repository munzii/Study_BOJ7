import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2941 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a = br.readLine();
		String[] n = { "c=" , "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		int sum =0;
		
		for(int i=0; i<a.length(); i++) {
			for(int j=0; j<n.length; j++) {
				if(a.substring(i).startsWith(n[j])) {
					i+= n[j].length()-1;
					break;
				}
			}
			sum++;
		}
		bw.write(String.valueOf(sum));
		
		br.close();
		bw.flush();
		bw.close();

	}
	
}