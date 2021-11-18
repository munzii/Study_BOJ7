import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P11720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int sum=0;
		
		while(a!=0) {
			sum+= a%10;
			sum/=10;
		}
		bw.write(sum+ "\n");
		
		br.close();
		bw.flush();
		bw.close();

	}

}
