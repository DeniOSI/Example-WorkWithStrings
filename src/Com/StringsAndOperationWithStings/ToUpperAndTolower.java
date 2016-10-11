package Com.StringsAndOperationWithStings;

/**
 * Created by Osipenko on 11.10.2016.
 */
public class ToUpperAndTolower {
    private String str;
    public ToUpperAndTolower(String st)
    {
        str = st;
    }

    public String ToUP()
    {
        return str.toUpperCase();
    }
    public String ToLOW()
    {
        return str.toLowerCase();
    }
}
