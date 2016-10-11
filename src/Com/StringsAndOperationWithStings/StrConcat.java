package Com.StringsAndOperationWithStings;

/**
 * Created by Osipenko on 11.10.2016.
 */
public class StrConcat {
    String[] st;
    public StrConcat(String[] st_arr)
    {
        st = st_arr;
    }
    public String stringConcat()
    {
        String tempString="";
        for(int i=0; i< st.length; i++)
        {
            tempString = tempString.concat(st[i]); //Метод склейки строк аналогичен (+)
        }
        return tempString;
    }
}
