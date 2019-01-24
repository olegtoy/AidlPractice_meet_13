package com.practice.olegtojgildin.aidlpractice_meet_13;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by olegtojgildin on 24/01/2019.
 */

public class DataStorage {

    public static final String PREF_NAME = "DATA";
    public static final String DATA_TEXT_KEY = "DATA_TEXT";
    private Context context;

    public DataStorage(Context context) {
        this.context = context;
    }

    public String getDataText() {
        SharedPreferences pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return pref.getString(DATA_TEXT_KEY, "EMPTY SHAREDPREFERENCES");
    }

    public void saveDataText(String text) {
        SharedPreferences pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(DATA_TEXT_KEY, text);
        editor.commit();
    }
}
