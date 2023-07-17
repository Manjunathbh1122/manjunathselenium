package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesUtility {
	public void readData(String filePath) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
		Properties properties =new Properties();
		try {
			properties.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
