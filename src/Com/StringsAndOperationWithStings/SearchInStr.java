package Com.StringsAndOperationWithStings;

/**
 * Created by Osipenko on 11.10.2016.
 */
public class SearchInStr {
    String str;
    public SearchInStr(String st)
    {
        str = st;
    }
    public String StFind(String search)
    {
        if(str.contains(search)) {
            return ("Подстрока входит в строку");
        }
        else {
            return ("Подстрока не входит в строку");
        }
    }
}
