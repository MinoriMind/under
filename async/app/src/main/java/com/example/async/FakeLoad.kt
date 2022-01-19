package com.example.async

import android.os.AsyncTask
import android.widget.TextView
import java.util.concurrent.TimeUnit

class FakeLoad(textView: TextView): AsyncTask<Void, Void, String>() {
    var text = textView

    override fun onPreExecute() {
        super.onPreExecute()
        text.text = "Loading..."
    }

    override fun doInBackground(vararg arg: Void?): String {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (e: InterruptedException) {
            e.printStackTrace();
        }

        return "Loading complete"
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        text.text = result
    }
}