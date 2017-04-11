package facerec.blueberry.com.utilslibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by wanxin on 16/9/14.
 * 不延迟排队Toast
 */
public class NoDelayedToast {

    private static Toast toast;

    /**
     * toast 字符串
     *
     * @param context Context
     * @param text    弹出的字符串
     */
    public static void show(Context context, String text) {
        if (toast == null) {
            toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
        }

        toast.show();
    }

    /**
     * toast 字符串Id
     *
     * @param context Context
     * @param resId   弹出的字符串Id
     */
    public static void show(Context context, int resId) {
        String showText = context.getResources().getString(resId);
        if (toast == null) {
            toast = Toast.makeText(context, showText, Toast.LENGTH_SHORT);
        } else {
            toast.setText(showText);
        }

        toast.show();
    }
}
