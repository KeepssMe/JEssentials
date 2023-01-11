package ru.kpss.jessentials.game.sudoku.classic;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class SudokuClassicField {

	public static final SudokuClassicField DIGITS_2X2 = new SudokuClassicField(2, "1234");
	public static final SudokuClassicField DIGITS_3X3 = new SudokuClassicField(3, "123456789");
	public static final SudokuClassicField DIGITS_ABCDEFG_4X4 = new SudokuClassicField(4, "123456789ABCDEFG");
	
	public static final SudokuClassicField DIGITS_2X3 = new SudokuClassicField(2, 3, "123456");
	public static final SudokuClassicField DIGITS_3X2 = new SudokuClassicField(3, 2, "123456");
	
	private final int rows, columns;
	private final Set<Integer> codes;
	
	public SudokuClassicField(int rows, int columns, CharSequence symbols) {
		if (rows < 1 || columns < 1)
			throw new IllegalArgumentException("The number of rows and columns of the field must be greater than 1 by 1");
		
		IntStream codes = symbols.chars().distinct();
		
		if (codes.count() != rows * columns)
			throw new IllegalArgumentException("The number of characters is not equal to the product of the number of rows and columns");
		
		this.rows = rows;
		this.columns = columns;
		this.codes = new HashSet<>(codes.mapToObj(value -> value).toList());
	}
	
	public SudokuClassicField(int rows, int columns, char[] symbols) {
		this(rows, columns, new String(symbols));
	}
	
	public SudokuClassicField(int size, CharSequence symbols) {
		this(size, size, symbols);
	}
	
	public SudokuClassicField(int size, char[] symbols) {
		this(size, size, new String(symbols));
	}
	
	public int getRowCount() {
		return rows;
	}
	
	public int getColumnCount() {
		return columns;
	}
	
	public boolean isSquare() {
		return rows == columns;
	}
	
	public boolean containsSymbol(char symbol) {
		return codes.contains((int) symbol);
	}
	
	public Set<Integer> getSymbolCodes() {
		return new HashSet<>(codes);
	}
	
	public int getSize() {
		return rows * columns;
	}
}
