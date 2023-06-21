package com.yatra.genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTestData {
	public static String[][] readData(String sheetName) throws EncryptedDocumentException, IOException{
		// Create File object to handle File 
		File file=new File("./src/test/resources/TestData/TestData.xlsx");
		
		//Create fileInputStream class Object
		FileInputStream fis=new FileInputStream(file);
		
		//Create Workbook
		Workbook workBook=WorkbookFactory.create(fis);
				
		//Create sheet
		Sheet sheet=workBook.getSheet(sheetName);
		
		//Get the count of rows from sheet
		int row=sheet.getPhysicalNumberOfRows();
		
		//Get the count of Columns
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		
		// Create 2D array and store the data into array
		String[][] data=new String[row-1][col];
		
		for(int i=1;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
				System.out.println(data[i-1][j]);
				
			}
		}
		
		return data;
		
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println(readData("SignUp"));
	}

}
