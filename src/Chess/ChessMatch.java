package Chess;

import boardgame.Board;

public class ChessMatch {
	
	// Aqui estao as regras do jogo!
	/*entao os movimentos permitidos 
	 * tamanho do tabuleiro etc.
	 */
	
	private Board board;
	 
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces(){
		//este metodo vai me retornar uma matriz de peças de xadrez
		//deste jogo
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j);
				//DOWNCASTING
			}
		}
		return mat;
	}

	
}
