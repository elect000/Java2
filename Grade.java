import java.io.*;
public class Grade {
    public static void main(String[] args) throws Exception {
	BufferedReader br =
	    new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	int res = Integer.parseInt(str);
	if(res>=50){
	    System.out.println("A");
	}
	else if(res<50){
	    System.out.println("B");
	}
	else{
	    System.out.println("error");
	}
    }
}
