package June21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D://Dummy.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet wc = wb.getSheetAt(0);
		int rc = wc.getLastRowNum();
		System.out.println("No of rows are::" + rc);
		XSSFRow row = wc.getRow(0);
		XSSFCell c1 = row.getCell(0);
		XSSFCell c2 = row.getCell(1);
		String username = c1.getStringCellValue();
		String password = c2.getStringCellValue();
		System.out.println(username + "  " + password);
		fi.close();
		wb.close();
	}

}
