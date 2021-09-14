package June19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Rowcount {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi=new FileInputStream("D:\\Dummy.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Login");
		XSSFRow row=ws.createRow(0);
		int rc=ws.getLastRowNum();
		int cc=row.getLastCellNum();
		System.out.println("No of Rows are::"+rc +"  "+"No of cells are::"+cc);
		fi.close();
		wb.close();

	}

}
