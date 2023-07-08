package A2__Parameterizationn_exceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ppp {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("D:\\saurabh.xlsx");
	
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	
	String value=sh.getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
	
	int lri=sh.getLastRowNum();
	  int lci= sh.getRow(0).getLastCellNum()-1;
	for(int i=0;i<=lri;i++)
	{
		for(int j=0;j<=lci;j++)
		{
			String value1=sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value1+" ");
		}
		System.out.println();
	}
			
	
	
}
}
