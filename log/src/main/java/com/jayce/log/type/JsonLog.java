package com.jayce.log.type;

import android.util.Log;

import com.jayce.log.JLog;
import com.jayce.log.JLogUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Create by jayce.dong on 2022/7/14
 */
public class JsonLog {
    public static void printJson(String tag, String msg, String headString) {

        String message;

        try {
            if (msg.startsWith("{")) {
                JSONObject jsonObject = new JSONObject(msg);
                message = jsonObject.toString(JLog.JSON_INDENT);
            } else if (msg.startsWith("[")) {
                JSONArray jsonArray = new JSONArray(msg);
                message = jsonArray.toString(JLog.JSON_INDENT);
            } else {
                message = msg;
            }
        } catch (JSONException e) {
            message = msg;
        }

        JLogUtil.printLine(tag, true);
        message = headString + JLog.LINE_SEPARATOR + message;
        String[] lines = message.split(JLog.LINE_SEPARATOR);
        for (String line : lines) {
            Log.d(tag, "║ " + line);
        }
        JLogUtil.printLine(tag, false);
    }
}
