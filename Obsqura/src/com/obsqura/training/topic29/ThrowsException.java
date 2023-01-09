package com.obsqura.training.topic29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsException {
	void fileRead() throws FileNotFoundException  {
	    File myFile = new File("D://temp/Employe.xlsx");
        FileInputStream fis = new FileInputStream(myFile);

	   }
	   public static void main(String args[]) {
		   ThrowsException obj = new ThrowsException();
		try {
		   obj.fileRead();
		}catch(FileNotFoundException e){
			System.out.println("Issue with file reading");
		}
	   }

}
