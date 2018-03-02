package com.hjx.util.phone;

/**
 * Android 按钮关键字
 */
public class KeyCode {

    /**
     * 控制键
     */
    public interface CTRL {
        String ENTER = " 66 ";//            回车键
        String ESCAPE = " 111 ";//          ESC键
        String DPAD_CENTER = " 23 ";//      导航键 确定键
        String DPAD_UP = " 19 ";//          导航键 向上
        String DPAD_DOWN = " 20 ";//        导航键 向下
        String DPAD_LEFT = " 21 ";//        导航键 向左
        String DPAD_RIGHT = " 22 ";//       导航键 向右
        String MOVE_HOME = " 122 ";//       光标移动到开始键
        String MOVE_END = " 123 ";//        光标移动到末尾键
        String PAGE_UP = " 92 ";//          向上翻页键
        String PAGE_DOWN = " 93 ";//        向下翻页键
        String DEL = " 67 ";//              退格键
        String FORWARD_DEL = " 112 ";//     删除键
        String INSERT = " 124 ";//          插入键
        String TAB = " 61 ";//              Tab键
        String NUM_LOCK = " 143 ";//        小键盘锁
        String CAPS_LOCK = " 115 ";//       大写锁定键
        String BREAK = " 121 ";//           Break/Pause键
        String SCROLL_LOCK = " 116 ";//     滚动锁定键
        String ZOOM_IN = " 168 ";//         放大键
        String ZOOM_OUT = " 169 ";//        缩小键
    }

    /**
     *
     */
    public interface PHONE {
        String CALL = " 5 ";//拨号键
        String ENDCALL = " 6 ";//挂机键
        String HOME = " 3 ";//按键Home
        String MENU = " 82 ";//菜单键
        String BACK = " 4 ";//返回键
        String SEARCH = " 84 ";//搜索键
        String CAMERA = " 27 ";//拍照键
        String FOCUS = " 80 ";//拍照对焦键
        String POWER = " 26 ";//电源键
        String NOTIFICATION = " 83 ";//通知键
        String MUTE = " 91 ";//话筒静音键
        String VOLUME_MUTE = " 164 ";//扬声器静音键
        String VOLUME_UP = " 24 ";//音量增加键
        String VOLUME_DOWN = " 25 ";//音量减小键
    }

}
