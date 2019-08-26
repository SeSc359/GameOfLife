
public class World {

	Cell[][] world;

	public World() {
	}
	// TODO give starting pattern

	public void initialiseWorld(int length, int broadth) {
		world = new Cell[length][broadth];
		for (int i = 0; i < world.length; i++) {
			for (int j = 0; j < world[0].length; j++) {
				world[i][j] = new Cell(0);
			}
		}
	}
	
	public void changeStateFromNeighbourhood(int[] neighbourhood, Cell actualCell) {
		int neigbourValue = SumUpNeighbours(neighbourhood);
		 
	}

	private int SumUpNeighbours(int[] neighbourhood) {
		int sumOfNeighbours = 0;
		for (int neighbour : neighbourhood) {
			sumOfNeighbours += neighbour;
		}
		return sumOfNeighbours;
	}
	
}
