package June21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWrite {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi=new FileInputStream("D://Dummy.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheetAt(0);
		int rc=ws.getLastRowNum();
		System.out.println("No.of rows are::"+rc);
		for(int i=1;i<=rc;i++) {
			String username=ws.getRow(i).getCell(0).getStringCellValue();
			if(wb.getSheet("Login").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC);
			{
			int celldata=(int)wb.getSheet("Login").getRow(i).getCell(1).getNumericCellValue();
			String password=String.valueOf(celldata);
			System.out.println(username+"  "+password);
			ws.getRow(i).createCell(2).setCellValue("login success");
			}
		}
		

	
	fi.close();
	FileOutputStream fo=new FileOutputStream("D://Result.xlsx");
	wb.write(fo);
	fo.close();
	wb.close();
	}
}
