
import java.io.*;

public class SampleException5 {
	
	private BufferedReader br;
	
	public static void main(String[] args) {
		
		String filePath = "D:\\comment.txt";
		
		try {
			
			SampleException5 sample = new SampleException5(filePath);
			sample.printFile();
			sample.finalize();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public SampleException5(String path) throws FileNotFoundException{
		
		File file = new File(path);  //  FileReader »ý¼ºÀÚ
		
		br = new BufferedReader(new FileReader(file));
	}
	
	public void printFile() throws IOException{
		
		if(br==null) {
			return;
		}
		
		String tmpStr = "";
		
		while((tmpStr=br.readLine())!=null) {
			System.out.println(tmpStr);
		}
	}
	
	public void finalize() {
		if(br!=null) {
			
			try {
				
				br.close();
			}
			
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
