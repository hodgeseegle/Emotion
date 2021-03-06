package com.xjh1994.emotion.util;

/**
 * Created by xjh1994 on 2015/12/28.
 */

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * 首选项管理
 *
 * @author smile
 * @ClassName: SharePreferenceUtil
 * @Description: TODO
 * @date 2014-6-10 下午4:20:14
 */
@SuppressLint("CommitPrefEdits")
public class SharePreferenceUtil {
    private SharedPreferences mSharedPreferences;
    private static SharedPreferences.Editor editor;

    public SharePreferenceUtil(Context context, String name) {
        mSharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        editor = mSharedPreferences.edit();
    }

    private String SHARED_KEY_NOTIFY = "shared_key_notify";
    private String SHARED_KEY_VOICE = "shared_key_sound";
    private String SHARED_KEY_VIBRATE = "shared_key_vibrate";

    private String SHARED_KEY_FIRST_USE = "shared_key_first_use";   //第一次使用
    private String SHARED_KEY_FIRST_USE_SAVE_GPRS = "shared_key_first_use_save_gprs";   //第一次使用省流量
    private String SHARED_KEY_SETTING_SAVE_GPRS = "shared_key_setting_save_gprs";   //第一次使用省流量

    // 是否允许推送通知
    public boolean isAllowPushNotify() {
        return mSharedPreferences.getBoolean(SHARED_KEY_NOTIFY, true);
    }

    public void setPushNotifyEnable(boolean isChecked) {
        editor.putBoolean(SHARED_KEY_NOTIFY, isChecked);
        editor.commit();
    }

    // 允许声音
    public boolean isAllowVoice() {
        return mSharedPreferences.getBoolean(SHARED_KEY_VOICE, true);
    }

    public void setAllowVoiceEnable(boolean isChecked) {
        editor.putBoolean(SHARED_KEY_VOICE, isChecked);
        editor.commit();
    }

    // 允许震动
    public boolean isAllowVibrate() {
        return mSharedPreferences.getBoolean(SHARED_KEY_VIBRATE, true);
    }

    public void setAllowVibrateEnable(boolean isChecked) {
        editor.putBoolean(SHARED_KEY_VIBRATE, isChecked);
        editor.commit();
    }

    public boolean isFirstUse() {
        return mSharedPreferences.getBoolean(SHARED_KEY_FIRST_USE, true);
    }

    //已经使用过一次
    public void setIsFirstUse(boolean isFirstUse) {
        editor.putBoolean(SHARED_KEY_FIRST_USE, isFirstUse);
        editor.commit();
    }

    public boolean isFirstUseSaveGprs() {
        return mSharedPreferences.getBoolean(SHARED_KEY_FIRST_USE_SAVE_GPRS, true);
    }

    //已经使用过一次
    public void setIsFirstUseSaveGprs(boolean isFirstUse) {
        editor.putBoolean(SHARED_KEY_FIRST_USE_SAVE_GPRS, isFirstUse);
        editor.commit();
    }

    public boolean isSaveGprs() {
        return mSharedPreferences.getBoolean(SHARED_KEY_SETTING_SAVE_GPRS, false);
    }

    public void setIsSaveGprs(boolean isFirstUse) {
        editor.putBoolean(SHARED_KEY_SETTING_SAVE_GPRS, isFirstUse);
        editor.commit();
    }

}
