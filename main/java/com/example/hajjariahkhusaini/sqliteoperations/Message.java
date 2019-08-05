/**
 * Created by Hajjariah Khusaini on 17/10/2017.
 */

package com.example.hajjariahkhusaini.sqliteoperations;

import android.content.Context;
import android.widget.Toast;

    public class Message {
    public static void message(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}

