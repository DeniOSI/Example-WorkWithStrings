package Com.StringsAndOperationWithStings;

/**
 * Created by Osipenko on 11.10.2016.
 */
public class SplitString {
    private String str;
    public SplitString(String st)
    {
        str = st;
    }
    public String[] StSplit()
    {
        return str.split(" ");
    }
}
