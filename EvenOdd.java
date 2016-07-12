import java.io.*;
public class EvenOdd {
    public static void main(String[] args) throws Exception {
	System.out.println("整数を入力してください");
	BufferedReader br =
	    new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	int num = Integer.parseInt(str);
	if(num%2==1){
	    System.out.println(num+"は奇数です。");
	}
	else{
	    System.out.println(num+"は偶数です。");
	}
	    
    }
}
