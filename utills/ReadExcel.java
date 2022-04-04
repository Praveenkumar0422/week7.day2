package utills;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadExcel {
	public static String[][]exceldata(String filename) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook book=new XSSFWorkbook("./exceldata/"+filename+".xlsx");
		XSSFSheet sheet = book.getSheet("sheet1");
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("row count: "+lastRowNum);
		XSSFRow row = sheet.getRow(1);
		int lastCellNum = row.getLastCellNum();
		System.out.println(lastCellNum);
		String[][]data=new String[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum; i++) {  
			for (int j = 0; j < lastCellNum; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
			}
			
		}
		book.close();
		return data;
		}
	

}
