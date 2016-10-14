/**
 * Created by Joshua on 10/13/2016.
 */
public class BombedWall extends Wall
{
    private Boolean _bomb;
    public BombedWall()
    {

    }
    public BombedWall(BombedWall other)
    {
        _bomb = other._bomb;
    }
    @Override
    public Wall Clone()
    {
        return new BombedWall(this);
    }
    public Boolean HasBomb()
    {
        return _bomb;
    }
}
