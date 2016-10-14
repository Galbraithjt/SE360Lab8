/**
 * Created by Joshua on 10/13/2016.
 */
public class MazePrototypeFactory extends MazeFactory
{
    private Maze _prototypeMaze;
    private Room _prototypeRoom;
    private Wall _prototypeWall;
    private Door _prototypeDoor;

    MazePrototypeFactory(Maze m, Wall w, Room r, Door d)
    {
        _prototypeDoor = d;
        _prototypeMaze = m;
        _prototypeRoom = r;
        _prototypeWall = w;
    }
    public  Maze MakeMaze()
    {
        return _prototypeMaze.Clone();
    }
    public Room MakeRoom()
    {
        return _prototypeRoom.Clone();
    }
    public Wall MakeWall()
    {
        return _prototypeWall.Clone();
    }
    public Door MakeDoor(Room r1, Room r2)
    {
        Door door = _prototypeDoor.Clone();
        door.Initialize(r1, r2);
        return door;
    }
}