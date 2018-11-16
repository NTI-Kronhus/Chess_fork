package pieces;

import board.ChessBoard;
import javafx.scene.paint.Color;

public class Pawn extends Piece {

	private boolean hasMoved = false;

	public Pawn(Color c) {
		super(c);
	}

	@Override
	public void showMove(int row, int col) {
		if (this.getColor() == Color.BLACK) {

			if (ChessBoard.all_squares.size() <= row + 1) {
				return;
			}
			ChessBoard.all_squares.get(row + 1).get(col).moveMark();

			if (ChessBoard.all_squares.size() <= row + 2 || hasMoved) {
				return;
			}
			ChessBoard.all_squares.get(row + 2).get(col).moveMark();
		} else if (this.getColor() == Color.WHITE) { // ELLER else{
			if (0 > row - 1) {
				return;
			}
			ChessBoard.all_squares.get(row - 1).get(col).moveMark();

			if (0 > row - 2 || hasMoved) {
				return;
			}
			ChessBoard.all_squares.get(row - 2).get(col).moveMark();
		}

	}

	@Override
	public void move() {
		hasMoved = true;
	}

}








