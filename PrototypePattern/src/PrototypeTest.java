/**
 * Created by Joshua on 10/13/2016.
 */
public class PrototypeTest
{
    public static void main(String[] args)
    {
        MazeGame game = new MazeGame();
        MazePrototypeFactory simpleMazeFactory = new MazePrototypeFactory(new Maze(), new Wall(), new Room(),new Door());
        Maze maze = game.CreateMaze(simpleMazeFactory);
    }
}
