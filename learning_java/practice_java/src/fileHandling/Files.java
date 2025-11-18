package fileHandling;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write
		try
        {
		FileWriter fw = new FileWriter("output.txt",true);   // true is used here to append
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write( " hey man");
		bw.newLine();
		bw.write("okay");
		bw.close();
		System.out.println("success");
	   }
       catch(Exception e) {
		// TODO Auto-generated catch block
		System.out.println("something happened");
	   }
      
		
	}

}
