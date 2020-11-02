package com.cxp.recorder;

import android.app.Application;

/**
 * 文 件 名: MyApplication
 * 创 建 人: CXP
 * 创建日期: 2020-11-02 16:12
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化文件路径
        FileUtils.initSDKDirs(FileUtils.getFilesPath(getApplicationContext()), getPackageName());
    }
}
