package A2__Parameterizationn_exceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterization1 {
	public static void main (String []args) throws EncryptedDocumentException, IOException
	{
	
		FileInputStream file=new FileInputStream("D:\\saurabh.xlsx");
		
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		//now we wnat to get cell value of  row i 0 col i 0 and cellvalue is string 
		String  value=sh.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
	  String value1=sh.getRow(0).getCell(1).getStringCellValue();
		System.out.println(value1);
		
		
		int ci=sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=ci;i++)
		{
			String value2=sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value2+" ");
		}
		System.out.println();
		System.out.println();
		int ri=sh.getLastRowNum();
		
		for(int i=0;i<=ri;i++)
		{
			for(int j=0;j<=ci;j++)
			{
				Cell cell=sh.getRow(i).getCell(j);
				CellType type =cell.getCellType();
				
				if(type==CellType.STRING)
				{
					String value3=sh.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value3+" ");
				}
				
				if(type==CellType.NUMERIC)
				{
					double value3=sh.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value3+" ");
				}
				if(type==CellType.BOOLEAN)
				{
					boolean value3=sh.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(value3+" ");
				}
				
			}
			

			System.out.println();
			
			
		}
		
		
		
	}

}
