/**
 * Created by Joshua on 10/13/2016.
 */
public class MazeGame
{
    public MazeGame()
    {

    }
    public Maze CreateMaze(MazePrototypeFactory r)
    {
        return new Maze(r);
    }
}
