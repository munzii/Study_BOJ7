import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P11720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int sum=0;
		String[] s = br.readLine().split("");
		
		for(int i=0; i<n; i++) {
			sum+= Integer.parseInt(s[i]);
		}
		
		bw.write(String.valueOf(sum));
		
		br.close();
		bw.flush();
		bw.close();

	}

}