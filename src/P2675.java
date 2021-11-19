import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2675 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int s = Integer.parseInt(br.readLine());
		
		for(int i=0; i<s; i++) {
			String[] arr = br.readLine().split(" ");
			int a = Integer.parseInt(arr[0]);
			String[] str = arr[1].split("");
			
			for(int j=0; j<str.length; j++) {
				for(int k=0; k<a; k++) {
					bw.write(String.valueOf(str[j]));
				}
			}
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}