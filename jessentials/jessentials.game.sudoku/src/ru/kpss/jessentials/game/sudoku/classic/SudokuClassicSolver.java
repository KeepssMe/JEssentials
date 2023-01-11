package ru.kpss.jessentials.game.sudoku.classic;

import java.util.HashSet;
import java.util.Set;

import ru.kpss.jessentials.tuples.TupleTwo;

public class SudokuClassicSolver {
	
	private SudokuClassicField field;
	private Cell[][] cells;
	
	public SudokuClassicSolver(SudokuClassicField field) {
		this.field = field;
		cells = new Cell[field.getSize()][field.getSize()];
	}
	
	public SudokuClassicSolver setValue(int row, int column, char value) {
		if (row >= field.getSize() || column >= field.getSize())
			throw new IllegalArgumentException("");
		
		if (!field.containsSymbol(value))
			throw new IllegalArgumentException("");
		
		cells[row][column] = new Cell(value);
		return this;
	}
	
	public SudokuClassicSolver resetValue(int row, int column) {
		if (row >= field.getSize() || column >= field.getSize())
			throw new IllegalArgumentException("");
		
		cells[row][column] = null;
		return this;
	}
	
	public char[][] solve() {
		solveVariants();
		
		return null;
	}
	
	private void solveVariants() {
		for(int row = 0; row < cells.length; ++row) {
			for(int column = 0; column < cells.length; ++column) {
				if (cells[row][column] == null) {
					var cell = new Cell();
					cell.variants.clear();
					cell.variants.addAll(getVariants(row, column));
					cells[row][column] = cell;
				}
			}
		}
	}
	
	private Set<Integer> getVariants(int row, int column) {
		
		return null;
	}
	
	private Set<TupleTwo<Integer, Integer>> getRelatedCells(int row, int column) {
		return null;
	}
	
	
	
	private record Cell(Integer symbol, Set<Integer> variants) {
		
		public Cell(char symbol) {
			this ((int) symbol, new HashSet<>());
		}
		
		public Cell() {
			this(null, new HashSet<>());
		}
		
		public boolean isSetValue() {
			return symbol != null;
		}
	}
	
}
