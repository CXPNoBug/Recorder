package com.cxp.recorder;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;

import java.io.File;

/**
 * 文 件 名: FileUtils
 * 创 建 人: CXP
 * 创建日期: 2020-11-02 16:05
 * 描    述: 文件管理
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class FileUtils {

    public static String DATA_DIR;
    public static String AUDIO_DIC;
    public static String VIDEO_DIC;
    public static String THUMBNAIL_DIR;

    /**
     * 日志、缓存的存储路径
     */
    public static boolean initSDKDirs(String sdcardPath, String appName) {
        if (TextUtils.isEmpty(sdcardPath)) {
            return false;
        }
        DATA_DIR = sdcardPath + "/" + appName;
        File file = new File(DATA_DIR);
        if (!file.exists()) {
            file.mkdirs();
        }
        AUDIO_DIC = DATA_DIR + "/audio";
        file = new File(AUDIO_DIC);
        if (!file.exists()) {
            file.mkdirs();
        }
        VIDEO_DIC = DATA_DIR + "/video";
        file = new File(VIDEO_DIC);
        if (!file.exists()) {
            file.mkdirs();
        }
        THUMBNAIL_DIR = THUMBNAIL_DIR + "/thumbanils";
        file = new File(THUMBNAIL_DIR);
        if (!file.exists()) {
            file.mkdirs();
        }
        return true;
    }


    /**
     * 用来存储一些长时间保留的数据,应用卸载会被删除
     *
     * @param context
     * @return
     */
    public static String getContextFilesPath(Context context) {
        return context.getFileStreamPath("cache").getPath();
    }


    /**
     * 外部存储，不会随着应用的卸载而消失
     *
     * @param context
     * @return
     */
    public static String getFilesPath(Context context) {
        String filePath;
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())
                || !Environment.isExternalStorageRemovable()) {
            //外部存储可用
            filePath = Environment.getExternalStorageDirectory().getPath();
        } else {
            //外部存储不可用
            filePath = context.getFilesDir().getPath();
        }
        return filePath;
    }
}
