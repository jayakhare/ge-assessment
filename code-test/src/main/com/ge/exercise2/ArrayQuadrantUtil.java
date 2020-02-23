package com.ge.exercise2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayQuadrantUtil {
	private static final Logger logger = LogManager.getLogger(ArrayQuadrantUtil.class);

	Object[][] data;

	public ArrayQuadrantUtil(Object[][] data) {
		this.data = data;
	}

	public Object[] getRowValues(int row) {
		Object[] rowArray = new Object[data[0].length];
		for (int i = 0; i < rowArray.length; i++) {
			rowArray[i] = data[row][i];
		}
		return rowArray;
	}

	public Object[] getColumnValues(int column) {
		Object[] columnArray = new Object[data.length];
		for (int i = 0; i < columnArray.length; i++) {
			columnArray[i] = data[i][column];
		}
		return columnArray;

	}

	public Object[] getQuadrantValues(int row, int column) {
		Object[] quadrantArray = new Object[4];
		quadrantArray[0] = data[row][column];
		quadrantArray[1] = data[row][column + 1];
		quadrantArray[2] = data[row + 1][column];
		quadrantArray[3] = data[row + 1][column + 1];
		return quadrantArray;
	}
}
