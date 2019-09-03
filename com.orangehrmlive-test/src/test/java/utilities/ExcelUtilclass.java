package utilities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilclass {

	public Sheet workSheet;
	public Workbook workBook;
	@SuppressWarnings("unused")
	private String path;

	public ExcelUtilclass(String path, String sheetName) {
		this.path = path;

		// Open the Excel File
		try {

			FileInputStream ExcelFile = new FileInputStream(path);
			// Access the required test data
			workBook = WorkbookFactory.create(ExcelFile);
			workSheet = workBook.getSheet(sheetName);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public String getCellData(int rowNum, int colNum) {

		Cell cell;
		try {
			cell = workSheet.getRow(rowNum).getCell(colNum);
			String cellData = cell.toString();
			return cellData;
		}

		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public List<Map<String, String>> getDataList() {
		// get all columns
		List<String> columns = getColumnNames();
		// this will be returned
		List<Map<String, String>> data = new ArrayList<>();
		for (int i = 1; i < rowCount(); i++) {
			// get each row
			Row row = workSheet.getRow(i);
			// Create map of the row using the column and value// column map key, cell value
			// --> map bvalue
			Map<String, String> rowMap = new HashMap<>();
			for (Cell cell : row) {
				int columnIndex = cell.getColumnIndex();
				rowMap.put(columns.get(columnIndex), cell.toString());

			}

			data.add(rowMap);
		}
		return data;
	}

	private int rowCount() {
		int rowsCount = workSheet.getLastRowNum();
		return rowsCount + 1;
	}

	private List<String> getColumnNames() {
		List<String> columns = new ArrayList<>();
		for (Cell cell : workSheet.getRow(0)) {
			columns.add(cell.toString());
		}
		return columns;
	}

}
