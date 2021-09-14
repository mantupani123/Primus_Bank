package June21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdatasecondway {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D://Dummy.xlsx");
		//get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws = wb.getSheetAt(0);
		//count no of rows
		int rc = ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		//iterate all rows
		for(int i=1; i<=rc;i++)
		{
			//get all rows 
			XSSFRow row =ws.getRow(i);
			String username =row.getCell(0).getStringCellValue();
			String password =row.getCell(1).getStringCellValue();
			System.out.println(username+"    "+password);
			//write some text into results cell
			row.createCell(2).setCellValue("iam so lazy to practise");
		}
fi.close();
FileOutputStream fo=new FileOutputStream("D://Result.xlsx");
wb.write(fo);

fo.close();
wb.close();
	}

}
