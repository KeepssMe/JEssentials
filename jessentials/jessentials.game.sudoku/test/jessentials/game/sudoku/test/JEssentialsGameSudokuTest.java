package jessentials.game.sudoku.test;

import ru.kpss.jessentials.game.sudoku.classic.SudokuClassicField;
import ru.kpss.jessentials.game.sudoku.classic.SudokuClassicSolver;

public class JEssentialsGameSudokuTest {
	
	public static void main(String[] args) {
		sudokuClassicTest();
	}
	
	private static void sudokuClassicTest() {
		var solver = new SudokuClassicSolver(SudokuClassicField.DIGITS_3X3);
		solver.setValue(2, 2, '2');
		
	}
	
}
