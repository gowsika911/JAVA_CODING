package fileHandling;
import java.io.FileReader;
import java.io.BufferedReader;
public class Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
	 FileReader fr =new FileReader("output.txt");
	 BufferedReader br =new BufferedReader(fr);
	 String line = br.readLine();
	 /*int c = fr.read();
	  System.out.print((char)c);
	  c=fr.read();
	  System.out.print((char)c);
	  while(c!=-1)
	  {
		  System.out.print((char)c);
		  c=fr.read();
	  }*/
	 while(line!=null)
	 {
		 System.err.println(line);
		 line = br.readLine();
	 }
	 br.close();
	  
 }
 catch(Exception e)
 {
	 
 }
	}

}
