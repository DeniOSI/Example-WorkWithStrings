package Сom.Main;
import Com.StringsAndOperationWithStings.*;

/**
 * Created by Osipenko on 11.10.2016.
 */
public class Interpoint {
    public  static  void  main(String[] args)
    {
        String str_classic_call = new String("standart call"); //Классическое созданите переменной
        System.out.println(str_classic_call);
        String str_value;

        str_value = "hello world test string";

        System.out.println(str_value);
        String str_text[] = {"java", "is", "cool"}; //Создание текстового массива
        for(String value: str_text)
        {
            System.out.println(value);
        }


        //region Разделение строки на слова
//        String[] temp_arr;
//        SplitString ss = new SplitString(str_value);
//        PrintS.Print(ss.StSplit());
        //endregion

        //region Склейка строк
//        StrConcat sc = new StrConcat(str_text);
//        System.out.println(sc.stringConcat());
        //endregion

        //region выдиление символов строки
//
//        char[] temp_char_ar;
//        StrToChar stc = new StrToChar(str_value);
//        temp_char_ar = stc.StringToChar();
//        PrintS.Print(temp_char_ar);
        //endregion

        //region поиск вхождения строки
//        SearchInStr sis = new SearchInStr(str_value);
//        System.out.println(sis.StFind("tst"));
//        System.out.println(sis.StFind("test"));
        //endregion

        //region Начало и конец строки
//        StartEndString ses = new StartEndString("www.google.com");
//        System.out.println(ses.StartSt("www"));
//        System.out.println(ses.EndSt("com"));
        //endregion

        //region верхний и нижний регистр
//        ToUpperAndTolower tupat =  new ToUpperAndTolower("ПРИВЕТ как ДеЛа");
//        System.out.println(tupat.ToLOW());
//        System.out.println(tupat.ToUP());
        //endregion

        //region Сравнение строк
//        EquStrings es = new EquStrings("Hello", "hello");
//        System.out.println(es.Equals());
//        System.out.println(es.ignoreCompare());
//        System.out.println(es.Compare());
        //endregion
    }
}
