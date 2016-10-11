package Com.StringsAndOperationWithStings;

/**
 * Created by Osipenko on 11.10.2016.
 */
public class StrToChar {
    private String basicString="";
    public StrToChar(String st)
    {
        basicString = st;
    }

    public char[] StringToChar()
    {
        char[] finish_arr = new char[basicString.length()];
        for (int z=0; z < basicString.length(); z++)
        {

            finish_arr[z] = basicString.charAt(z); //метод разбивки на символы
        }
        return finish_arr;
    }
}
