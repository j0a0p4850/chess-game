package boardgame;

public abstract class Piece {

	protected Position position;
	/*
	 * O protected faz com que nenhuma outra classe, que esteja fora do pacote em
	 * que essa se encontra, possa ter acesso a ela.
	 */
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
		// a posição de um peça recem criada vai ser nula. 
		//Pois ela ainda nao foi colocada no tabuleiro ainda
		//OBS: Nao precisa por esse "position = null" o java ja faz isso automaticamente
	}

	protected Board getBoard() {
		return board;
		/* nao é desejavel que outra classe alem das que estao no pacote
		 * esteja visivel e acessivel. Assim impede que sejam modificadas
		 * e causem erros futuros. Pois é de uso interno do jogo
		 */
	}

	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMoves(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
		/*Este é um metodo concreto que esta usando um metodo abstrato 
		 * isso é chamato um rook metodo, pois faz um gancho com a
		 * subclasse
		 */
	}
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i =0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
	
	