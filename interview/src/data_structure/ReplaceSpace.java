package data_structure;

/**
 * Created by xding on 2016/3/28.
 */
public class ReplaceSpace {

    public static void main(String[] args) {
        ReplaceSpace r = new ReplaceSpace();
        String str = "We are happy!";
        StringBuffer stb = new StringBuffer(str);
        String result;

        result = r.replaceSpace2(stb);
        System.out.print(result);
    }

    public String replaceSpace1(StringBuffer str) {
        String result;
        if(str == null) {
            result = null;
        } else {
            result = str.toString().replaceAll(" ", "%20");
        }

        return result;
    }

    public String replaceSpace2(StringBuffer str) {
        String sti = str.toString();
        char[] strChar = sti.toCharArray();
        StringBuffer stb = new StringBuffer();

        for(char c : strChar) {
            if(c == ' ') {
                stb.append("%20");
            } else {
                stb.append(c);
            }
        }

        return stb.toString();
    }

//    public String replaceSpace3(StringBuffer str) {
//        String result;
//        if(str == null) {
//            result = null;
//        } else {
//            for()
//        }
//
//        return result;
//    }
}
