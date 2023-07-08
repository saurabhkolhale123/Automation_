package A2__Parameterizationn_exceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class excel1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
        FileInputStream file=new FileInputStream("D:\\saurabh.xlsx");
        
        Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	
	String value=sh.getRow(0).getCell(1).getStringCellValue();
	
	System.out.println(value);
	
	
	   int lri=sh.getLastRowNum();
	   int lci= sh.getRow(0).getLastCellNum()-1;
	    
	for(int i=0;i<=lri;i++)
	{
		for(int j=0;j<=lci;j++)
		{
			org.apache.poi.ss.usermodel.Cell cellinfo=sh.getRow(i).getCell(j);
			
			CellType type=cellinfo.getCellType();
			if(type==CellType.STRING)
			{
				String value1=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value1+" ");
			}
			if(type==CellType.NUMERIC)
			{
				double value1=sh.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(value1+" ");
			}
			if(type==CellType.BOOLEAN)
			{
				boolean value1=sh.getRow(i).getCell(j).getBooleanCellValue();
				System.out.print(value1+" ");
			}
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
}
}
