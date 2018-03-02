package com.hjx.util.phone;

public class FileOperator extends AndroidOperator {

    //用户手机sd卡路径
    private static final String USER_SD_FILE_PATH = "/storage/emulated/0";
    //默认的截图图片名称
    private static final String SCREENCAP_FILE_NAME = "screencap.png";
    //取文件
    private static final String PULL = "pull %s ";
    //删除
    private static final String RM = String.format(SHELL, "rm %s ");
    //截图命令
    private static final String SHELL_SCREENCAP_p = String.format(SHELL, "/system/bin/screencap -p " + USER_SD_FILE_PATH + "/%s ");
    //从手机里取文件
    private static final String PULL_FILE = String.format(PULL, USER_SD_FILE_PATH + "/%s %s ");
    //从手机删除文件
    private static final String DEL_FILE = String.format(RM, USER_SD_FILE_PATH + "/%s ");


    /**
     * 把手机里的文件取出来
     *
     * @param src
     * @param target
     * @return
     */
    public boolean pullFile(String src, String target) {
        return action(String.format(PULL_FILE, src, target));
    }

    /**
     * 删除手机里的文件
     *
     * @param target
     * @return
     */
    public boolean delFile(String target) {
        return action(String.format(DEL_FILE, target));
    }

    /**
     * 手机截图
     *
     * @param target 存放在手机上的位置和名称
     * @return
     */
    public boolean screencap(String target) {
        if (target == null) {
            target = SCREENCAP_FILE_NAME;
        }
        return action(String.format(SHELL_SCREENCAP_p, target));
    }

    /**
     * 获取当前手机屏幕图像
     *
     * @param target 存放在电脑上的位置和名称
     * @return
     */
    public boolean oneScreen(String target) {
        //截图
        screencap(null);
        //传输图片
        pullFile(SCREENCAP_FILE_NAME, target);
        //删除手机文件
        delFile(SCREENCAP_FILE_NAME);
        return true;
    }


}
