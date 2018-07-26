package com.hjx.util.phone;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

/**
 * 安卓手机的操作
 */
public class AndroidOperator {

    private Execute execute;

    private long defaultTime = 100;

    protected final static String SHELL = "shell %s ";

    private final static String SHELL_INPUT = String.format(SHELL, "input %s ");

    public boolean click(Key key) {
        String keyevent = String.format(SHELL_INPUT, Command.KEYEVENT.v());
        String command = String.format(keyevent, key.v());
        return action(command);
    }

    public boolean input(String inputText) {
        String text = String.format(SHELL_INPUT, Command.TEXT.v());
        return action(String.format(text, inputText));
    }

    public boolean input(Input... input) {
        String keyevent = String.format(SHELL_INPUT, Command.KEYEVENT.v());
        String[] p = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            p[i] = input[i].v();
        }
        return action(String.format(keyevent, StringUtils.join(p, "  ")));
    }

    public boolean click(Point point) {
        return action(swipeCommand(point, null, defaultTime));
    }

    public boolean click(Point point, long time) {
        return action(swipeCommand(point, null, time));
    }

    public boolean slide(Point from, Point to) {
        return action(swipeCommand(from, to, defaultTime));
    }

    public boolean slide(Point from, Point to, long time) {
        return action(swipeCommand(from, to, time));
    }

    /**
     * 执行命令
     *
     * @param command
     * @return
     */
    boolean action(String command) {
        try {
            Thread.sleep(500L);
            execute.action(command);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 生成指令
     *
     * @param from
     * @param to
     * @param time
     * @return
     */
    private String swipeCommand(Point from, Point to, long time) {
        if (to == null) {
            to = from;
        }
        String swipe = String.format(SHELL_INPUT, Command.SWIPE.v());
        String command = String.format(swipe, from.x, from.y, to.x, to.x, time);
        return command;
    }

    private enum Command {

        KEYEVENT("keyevent %s "),
        TEXT("text %s "),
        SWIPE("swipe %s %s %s %s %s ");

        private final String v;

        Command(String v) {
            this.v = v;
        }

        public String v() {
            return v;
        }

    }

    public void setExecute(Execute execute) {
        this.execute = execute;
    }
}
