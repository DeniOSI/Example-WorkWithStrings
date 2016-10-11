package Com.StringsAndOperationWithStings;

/**
 * Created by Osipenko on 11.10.2016.
 */
public class StartEndString {
    private String str;
    public StartEndString(String str)
    {
        this.str = str;
    }

    public String StartSt(String start)
    {
        if(str.startsWith(start))
        {
            return "Начинается";
        }
        else
        {
            return "Не начинается";
        }
    }
    public String EndSt(String start)
    {
        if(str.endsWith(start))
        {
            return "Заканчивается";
        }
        else
        {
            return "Не заканчивается";
        }
    }
}
