package A2__Parameterizationn_exceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class para {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("D:\\saurabh.xlsx");
	
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	
	int lri=sh.getLastRowNum();
	int lci =sh.getRow(0).getLastCellNum()-1;
	
	for(int i=0;i<=lri;i++)
	{
		for(int j=0;j<=lci;j++)
		{
			String value=sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
