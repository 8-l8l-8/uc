package com.uc.system.util;

/**
 * 
 * @deprecated:新浪微博mid与url互转
 * @author LihuaTang 
 * @date 2015年7月29日 下午5:20:47
 */
public class MidAurl {
    
    public static void main(String[] args) throws Exception {
        
        String a_mid = url2mid("wr0tem19gl");
        System.out.println(a_mid);
        
        String a_url = mid2url("201101123660273937");
        System.out.println(a_url);
        
        System.out.println(isFirstZero("wr0tem19gl"));
    }
    
    public  static String url2mid(String url) {

        String mid = "";
        if (!isFirstZero(url)) {
            for (int i = url.length() - 4; i > -4; i = i - 4) {//分别以四个为一组
                int offset1 = i < 0 ? 0 : i;
                int offset2 = i + 4;
                String str = url.toString().substring(offset1, offset2);
                str = str62to10(str);//String类型的转化成十进制的数
                // 若不是第一组，则不足7位补0
                if (offset1 > 0) {
                    while (str.length() < 7) {
                        str = '0' + str;
                    }
                }
                mid = str + mid;
            }
        } else {
            for (int i = url.length() - 4; i > -4; i = i - 4) {
                int offset1 = i < 0 ? 0 : i;
                int offset2 = i + 4;
                if (offset1 > -1 && offset1 < 1 || offset1 > 4) {
                    String str = url.toString().substring(offset1, offset2);
                    str = str62to10(str);
                    // 若不是第一组，则不足7位补0
                    if (offset1 > 0) {
                        while (str.length() < 7) {
                            str = '0' + str;
                        }
                    }
                    mid = str + mid;
                } else {
                    String str = url.toString().substring(offset1 + 1, offset2);
                    str = str62to10(str);
                    // 若不是第一组，则不足7位补0
                    if (offset1 > 0) {
                        while (str.length() < 7) {
                            str = '0' + str;
                        }
                    }
                    mid = str + mid;
                }
            }
        }
        return mid;
    }
/**
* mid转换成url编码以后的值
* @param mid
* @return
*/
    public static String mid2url(String mid) {
        String url = "";
        for (int j = mid.length() - 7; j > -7; j = j - 7) {//以7个数字为一个单位进行转换
            int offset3 = j < 0 ? 0 : j;
            int offset4 = j + 7;
            // String l = mid.substring(mid.length() - 14, mid.length() - 13);
            if ((j > 0 && j < 6 ) && (mid.substring(mid.length() - 14, mid.length() - 13).equals("0")&& mid.length()==19)) {
                String num = mid.toString().substring(offset3 + 1, offset4);
                num = int10to62(Integer.valueOf(num));//十进制转换成62进制
                url = 0 + num + url;
                if(url.length()==9 ){
                    url = url.substring(1, url.length());
                }
            } else {
                String num = mid.toString().substring(offset3, offset4);
                num = int10to62(Integer.valueOf(num));
                
                /*From Tang 20121013*/
                while(j>0&&num.length()<4)
                {
                   num = 0+num;
                } 
                url = num + url;
            }
        }
        
        
        return url;
    }
    
    
    public static boolean isFirstZero(String url)
    {
        for(int i=1;(url.length()-4*i)>0;i++)
        {
            if("0".equals(url.subSequence(url.length()-(4*i), url.length()-(4*i)+1)))
            {
                return true;
            }
        }
        return false;
    }
/**
* 62进制转换成10进制
* @param str
* @return
*/
    public static String str62to10(String str) {
        String i10 = "0";
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = str.length() - i - 1;
            String s = str.substring(i, i + 1);
            for (int k = 0; k < str62key.length; k++) {
                if (s.equals(str62key[k])) {
                    int h = k;
                    c += (int) (h * Math.pow(62, n));
                    break;
                }
            }
            i10 = String.valueOf(c);
        }
        return i10;
    }
/**
* 10进制转换成62进制
* @param int10
* @return
*/
    public static String int10to62(double int10) {
        String s62 = "";
        int w = (int) int10;
        int r = 0;
        int a = 0;
        while (w != 0) {
            r = (int) (w % 62);
            s62 = str62key[r] + s62;
            a = (int) (w / 62);
            w = (int) Math.floor(a);
        }
        return s62;
    }
    
    static String[] str62key = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
        "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
        "S", "T", "U", "V", "W", "X", "Y", "Z" };
    
}