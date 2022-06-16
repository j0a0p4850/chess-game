package boardgame;

public class Piece {

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

	
}
