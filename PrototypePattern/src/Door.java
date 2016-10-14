/**
 * Created by Joshua on 10/13/2016.
 */
public class Door extends MapSite
{
    private Room _room1;
    private Room _room2;
    public Door()
    {

    }
    public Door(Door other)
    {
        _room1 = other._room1;
        _room2 = other._room2;
    }
    public Door Clone()
    {
        return new Door();
    }
    public void Initialize(Room r1, Room r2)
    {
        _room1 = r1;
        _room2 = r2;
    }

}
