package gba.com.heavywork;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class Task extends AsyncTask<String, Integer, String> {
/*
1) Тип входных данных. Это данные, которые пойдут на вход AsyncTask
2) Тип промежуточных данных. Данные, которые используются для вывода промежуточных результатов
3) Тип возвращаемых данных. То, что вернет AsyncTask после работы.
*/
    private static final String TAG = "HEAVYWORK";
    TextView info;


    public Task(TextView info) {
        this.info = info;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d(TAG, "onPreExecute");
        info.setText("Begin");
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Log.d(TAG, "onPostExecut");
        info.setText("End");
    }

    @Override
    protected String doInBackground(String... strings) {
      //  Log.d(TAG, "doInBackgtound: " + strings[0]);
        try {
            Thread.sleep(5555);
            publishProgress(10);
            downloadFile(strings[0]);
            Thread.sleep(4444);
            publishProgress(20);
            downloadFile(strings[0]);
            Thread.sleep(3333);
            publishProgress(30);
            downloadFile(strings[0]);
            Thread.sleep(1111);
            publishProgress(40);
            downloadFile(strings[0]);
            Thread.sleep(2222);
            publishProgress(50);
            downloadFile(strings[0]);
            Thread.sleep(6666);
            publishProgress(60);
            Thread.sleep(7777);
            publishProgress(70);
            downloadFile(strings[0]);
            Thread.sleep(8888);
            publishProgress(80);
            downloadFile(strings[0]);
            Thread.sleep(9999);
            publishProgress(90);
            downloadFile(strings[0]);
            Thread.sleep(1245);
            publishProgress(100);
            downloadFile(strings[0]);
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Done";
    }
    private void downloadFile(String url) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        info.setText("Downloaded " + values[0]);
    }
}
