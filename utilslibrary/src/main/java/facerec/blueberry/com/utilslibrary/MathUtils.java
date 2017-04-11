package facerec.blueberry.com.utilslibrary;

import java.text.DecimalFormat;

//数学工具类
public class MathUtils {

    //保留两位小数
    public static String keep2Decimal(double num) {
        DecimalFormat df = new java.text.DecimalFormat("#.00");
        return df.format(num);
    }


}

