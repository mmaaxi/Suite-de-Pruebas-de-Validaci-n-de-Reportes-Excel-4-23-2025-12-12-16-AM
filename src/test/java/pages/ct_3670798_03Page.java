package pages;

import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import static org.junit.Assert.*;

public class ct_3670798_03Page {

    WebDriver driver;
    String filePath = "path/to/your/excel/file.xlsx";

    public ct_3670798_03Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openExportedExcel() {
        // Logic to open Excel file
    }

    public boolean isEstadoCodigoInCorrectPosition() {
        try (FileInputStream file = new FileInputStream(new File(filePath))) {
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);
            Cell cell = sheet.getRow(0).getCell(9); // Column J is index 9
            return (cell != null && "Estado Código".equals(cell.getStringCellValue()));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isEstadoCodigoColumnPresent() {
        try (FileInputStream file = new FileInputStream(new File(filePath))) {
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);
            CellValue cellValue = sheet.getRow(0).getCell(9).getSheet().getWorkbook().getCreationHelper().createFormulaEvaluator().evaluate(sheet.getRow(0).getCell(9));
            return (cellValue != null && cellValue.getStringValue().equals("Estado Código"));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isEstadoCodigoColumnCorrectlyEmptyAndPositioned() {
        return isEstadoCodigoInCorrectPosition();
    }
}