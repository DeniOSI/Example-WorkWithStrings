package Com.StringsAndOperationWithStings;

/**
 * Created by Osipenko on 11.10.2016.
 */
public class EquStrings {

    String str, str1;
    public EquStrings(String st, String st1)
    {
        str = st;
        str1 = st1;
    }

    public boolean Equals()
    {
        return str.equals(str1);
    }
    public int Compare()
    {
        return str.compareTo(str1);
    }

    public boolean ignoreCompare()
    {
        return (str.equalsIgnoreCase(str1));
    }
}
