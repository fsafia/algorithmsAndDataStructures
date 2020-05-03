package lesson7.ClassWork.HomeWork;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

public class ExcelReader {
    public static final String file = "forLesson7.xlsx";
    public static void main(String[] args) throws IOException, InvalidFormatException {

        Workbook workbook = WorkbookFactory.create(new File(file));

        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
        Sheet sheet = workbook.getSheetAt(0); //получили лист с инд=0 - это 1й лист

        Iterator<Row> rowIterator = sheet.rowIterator(); //cчитывание построчно
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            // переберем столбцы текущей строки
            Iterator<Cell> cellIterator = row.cellIterator();

            int i = 0;
            while (cellIterator.hasNext()) {

//                    for (int i = 0; i < sheet.getNumMergedRegions(); i++){
//                        CellRangeAddress region = sheet.getMergedRegion(i); //Region of merged cells
//
//                        int colIndex = region.getFirstColumn(); //number of columns merged
//                        int rowNum = region.getFirstRow();      //number of rows merged
//
//                        for (int j = region.getFirstRow(); j < region.getLastRow(); j++) {
//                           // Cell cell = row.getCell(2, j);
//
//                        }
//
//                        System.out.println(colIndex);
//                    }

                CellRangeAddress region = sheet.getMergedRegion(i);

                for (int j = region.getFirstRow(); j < region.getLastRow(); j++) {
                    // Cell cell = row.getCell(2, j);

                    try {
                        Row row1 = rowIterator.next();
                        Cell nameDo = row1.getCell(1);
                        Cell plan = row1.getCell(2);
                        double planValue  = plan.getNumericCellValue();

                        double actualValue = row1.getCell(3).getNumericCellValue();

                        double planCompletion =  actualValue / planValue * 100;


                        System.out.println("nameDo: " + nameDo + " процент выполнения плана " + planCompletion + "%");
                    }

                    catch (NoSuchElementException e) {
                        return;
                    }

                }

//                Cell cell = cellIterator.next();
//                String cellValue = dataFormatter.formatCellValue(cell);
//                System.out.print(cellValue + "\t");
//                i++;
            }
            System.out.println();
        }



    }

}
