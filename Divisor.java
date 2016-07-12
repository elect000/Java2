import java.io.*;
public class Divisor {
    public static void main(String[] args) throws Exception {
	System.out.println("A?");
	BufferedReader br =
	    new BufferedReader(new InputStreamReader(System.in));;
	String str1 = br.readLine();
	int num1 = Integer.parseInt(str1);
	System.out.println("B?");
	String str2 = br.readLine();
	int num2 = Integer.parseInt(str2);

	boolean ans = (num1%num2==0);

	if(ans){
	    System.out.println(num1+"は"+num2+"の約数です。");
	}
	else{
	    System.out.println(num1+"は"+num2+"の約数ではありません。");
	}
    }
}
