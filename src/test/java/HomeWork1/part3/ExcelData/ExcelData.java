package HomeWork1.part3.ExcelData;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ExcelData {
    private static FileInputStream file;
    private static XSSFSheet sheet;

    public ExcelData() throws IOException {
        file = new FileInputStream(new File("C:\\My_Files\\java\\TA\\src\\test\\java\\HomeWork1\\part3\\ExcelData\\Book1.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheetAt(0);
    }


    public static Object[] getValidEmails() throws IOException {
        Iterator<Row> rowIterator = sheet.iterator();
        ArrayList<String> getValid = new ArrayList<String>();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
                    getValid.add(cell.getStringCellValue());
                    System.out.println(getValid);
                }
            }
        }
        file.close();
        return getValid.toArray();
    }

//    public static Object[] getInvalidEmails() {
//        return Object[];
//    }



}
