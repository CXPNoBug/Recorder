package com.cxp.recorder;

import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

/**
 * 文 件 名: RecorderAudioActivity
 * 创 建 人: CXP
 * 创建日期: 2020-11-02 15:06
 * 描    述: 录制音频
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class RecorderAudioActivity extends AppCompatActivity {


    private MediaRecorder mRecorder;
    private File mFile;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recorder_audio);
    }

    public void clickLis(View view) {
        switch (view.getId()) {
            case R.id.audio_start:
                //开始
                break;
            case R.id.audio_stop:
                //结束
                break;
            case R.id.audio_play:
                //播放
                break;
        }
    }

    /**
     * 开始录制
     */
    private void startRecording() {
        if (mRecorder != null) {
            mRecorder.reset();
        } else {
            mRecorder = new MediaRecorder();
        }
        mRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        mRecorder.setOutputFormat(MediaRecorder.OutputFormat.DEFAULT);
        mRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
//        File file = new File(mFile);
//        Log.d(AppUtils.TAG,"创建文件的路径:" + mFile);
//        Log.d(AppUtils.TAG,"文件创建成功:" + file.exists());
    }

    /**
     * 停止录制
     */
    private void stopRecording() {

    }
}
