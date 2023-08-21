package testutility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertisReder {
	
	public class PropertiesReader {
		
		Properties p=new Properties();
		
		public Properties getconfigProperties() throws IOException
		{
			File f=new File("D:\\selenium\\Techm\\config\\testdata.properties");
			
			FileReader reader=new FileReader(f);
			
			p.load(reader);
			
			return p;
			
		}
		

	}

}
