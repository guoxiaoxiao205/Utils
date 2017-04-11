package facerec.blueberry.com.utilslibrary;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by wanxin on 16/12/8.
 */

public class SPUtil {
    //存储的sharedPreferences文件名
    private static final String FILE_NAME = "RRLotteryFile";
    //登陆密码保存key
    public static final String LOGIN_PWD = "login_pwd";
    //记住密码的key
    public static final String LOGIN_MOBILE = "login_mobile";
    //记住密码的key
    public static final String REMEMBER_LOGIN_PWD = "remember_login_pwd";
    //用户token key
    public static final String TOKEN = "token";
    //客户单上次启动版本号
    public static final String VERSION_NAME = "version_name";
    //图片地址前缀
    public static final String IMAGE_PRE = "image_pre";
    //新手引导首页 玩法d11 fast3 投注
    public static final String HOME_ENGAGE="home_engage";
    public static final String D11_ENGAGE="d11_engage";
    public static final String FAST3_ENGAGE="fast3_engage";
    public static final String BET_ENGAGE="bet_engage";
    //是否第一次显示omit
    public static final String DPC_OMIT_SSQ="dpc_omit_Ssq";
    //是否第一次显示omit
    public static final String DPC_OMIT_DLT="dpc_omit_dlt";
    //是否屏蔽购彩
    public static final String PURCHASE="purChase";


    /**
     * 保存数据到文件
     *
     * @param key
     * @param data
     */
    public static void saveData(String key, Object data,Context context) {

        String type = data.getClass().getSimpleName();
        SharedPreferences sharedPreferences =context
                .getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        if ("Integer".equals(type)) {
            editor.putInt(key, (Integer) data);
        } else if ("Boolean".equals(type)) {
            editor.putBoolean(key, (Boolean) data);
        } else if ("String".equals(type)) {
            editor.putString(key, (String) data);
        } else if ("Float".equals(type)) {
            editor.putFloat(key, (Float) data);
        } else if ("Long".equals(type)) {
            editor.putLong(key, (Long) data);
        }

        editor.apply();
    }

    /**
     * 从文件中读取数据
     *
     * @param key
     * @param defValue
     * @return
     */
    public static Object getData(String key, Object defValue,Context context) {

        String type = defValue.getClass().getSimpleName();
        SharedPreferences sharedPreferences = context.getSharedPreferences
                (FILE_NAME, Context.MODE_PRIVATE);

        //defValue为为默认值，如果当前获取不到数据就返回它
        if ("Integer".equals(type)) {
            return sharedPreferences.getInt(key, (Integer) defValue);
        } else if ("Boolean".equals(type)) {
            return sharedPreferences.getBoolean(key, (Boolean) defValue);
        } else if ("String".equals(type)) {
            return sharedPreferences.getString(key, (String) defValue);
        } else if ("Float".equals(type)) {
            return sharedPreferences.getFloat(key, (Float) defValue);
        } else if ("Long".equals(type)) {
            return sharedPreferences.getLong(key, (Long) defValue);
        }
        return null;
    }
}
