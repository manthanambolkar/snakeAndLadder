package ENGINE;

/**
 * Created by Manthan Ambolkar.
 */
public class Ladder
{
    final Tile top;
    final Tile bottom;

    Ladder(Tile top, Tile bottom)
    {
        this.top = top;
        this.bottom = bottom;
    }

    public Tile getBottom()
    {
        return bottom;
    }

    public Tile getTop()
    {
        return top;
    }
}
