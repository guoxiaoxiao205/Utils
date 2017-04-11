package facerec.blueberry.com.utilslibrary;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;


import java.util.List;

/**
 * Created by yanjun on 2017/1/22.
 */

public class PayTools {

    //判断微信是否安装
    public static boolean isWeixinAvilible(Context context) {
        final PackageManager packageManager = context.getPackageManager();// 获取packagemanager
        List<PackageInfo> pinfo = packageManager.getInstalledPackages(0);// 获取所有已安装程序的包信息
        if (pinfo != null) {
            for (int i = 0; i < pinfo.size(); i++) {
                String pn = pinfo.get(i).packageName;
                if (pn.equals("com.tencent.mm")) {
                    return true;
                }
            }
        }
        return false;
    }

}
