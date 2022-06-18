package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

public class Paw extends ChessPiece {

	public Paw(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0, 0);
		
		if(getColor() == Color.White) {
			p.setValues(position.getRow() -1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			p.setValues(position.getRow() -2, position.getColumn());
			Position p2 = new Position(position.getRow() -1, position.getColumn());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;
			}

			p.setValues(position.getRow() -1, position.getColumn() -1);
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			}
			p.setValues(position.getRow() -1, position.getColumn() +1);
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
		
			}
		}
		else {
			if(getColor() == Color.Black) {
				p.setValues(position.getRow() +1, position.getColumn());
				if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getMoveCount() == 0) {
					mat[p.getRow()][p.getColumn()] = true;
				}
				p.setValues(position.getRow() +2, position.getColumn());
				Position p2 = new Position(position.getRow() +1, position.getColumn());
				if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
					mat[p.getRow()][p.getColumn()] = true;
				}

				p.setValues(position.getRow() +1, position.getColumn() -1);
				if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true;
				}
				p.setValues(position.getRow() +1, position.getColumn() +1);
				if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true;
			
				}
			}
			
		}

		return mat;
	}
	
	@Override
	public String toString() {
		return "P";
	}
}
