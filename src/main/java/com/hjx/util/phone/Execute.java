package com.hjx.util.phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Execute {

    static Runtime runtime = Runtime.getRuntime();

    private String adb;

    public Execute(String adb) {
        this.adb = adb;
    }

    /**
     * 执行一条命令
     *
     * @param command
     * @throws IOException
     */
    public List<String> action(String command) throws IOException {
        command = adb + " " + command + " \n";
        System.out.println("[Execute]: [action] do: " + command);
        Process process = runtime.exec(command);
        //取得命令结果的输出流
        InputStream inputStream = process.getInputStream();
        //用一个读输出流类去读
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        //用缓冲器读行
        BufferedReader br = new BufferedReader(inputStreamReader);
        List<String> res = new ArrayList<String>();
        String line = null;
        //直到读完为止
        System.out.println("[Execute]: [action] return: ");
        while ((line = br.readLine()) != null) {
            res.add(line);
            System.out.println(line);
        }
        return res;
    }

}
