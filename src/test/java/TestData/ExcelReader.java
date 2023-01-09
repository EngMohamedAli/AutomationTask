package TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	static FileInputStream fis = null;

	public FileInputStream getFileInputStream(String fileName) throws FileNotFoundException{
		String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\TestData\\"+fileName+".xlsx";
		File scrFile = new File(filePath);
		fis = new FileInputStream(scrFile);
		return fis;
	}
	
	public Object[][] getExcelData(String fileName, int sheetIndex, int numberOfCols) throws IOException{	
		fis = getFileInputStream(fileName);
		XSSFWorkbook wb = new XSSFWorkbook(fis);	
		XSSFSheet sheet = wb.getSheetAt(sheetIndex);
		int numberOfRows = sheet.getLastRowNum()+1;
		String [][] arrayExcelValue = new String[numberOfRows][numberOfCols];
		for(int i = 0; i < numberOfRows ; i++){
			for (int j = 0; j< numberOfCols ; j++){
				XSSFRow row = sheet.getRow(i);
				arrayExcelValue[i][j] = row.getCell(j).toString();}
		}
		wb.close();
		return arrayExcelValue ;
	}
	
	
}