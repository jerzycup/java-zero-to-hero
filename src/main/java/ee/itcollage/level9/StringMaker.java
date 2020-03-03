package ee.itcollage.level9;

public class StringMaker {

    //todo fix tests
    /**
     * Gives you a text containing of x times of string c.
     * @param s the string to repeat
     * @param x how many times you want the string
     */
    public static String make(String s, int x) {
        if(x<0){
            x=0;
        }
        String chars = s.repeat(x);
        return chars;
    }

    /**
     * Gives you a text containing of x times of string c plus y times of string c.
     */
    public static String make(String s1, int x1, String s2, int x2) {
        if(x1<0){
            x1=0;
        }
        if(x2<0){
            x2=0;
        }
        String chars = s1.repeat(x1) + s2.repeat(x2);
        return chars;
    }
}
