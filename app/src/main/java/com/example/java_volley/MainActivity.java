package com.example.java_volley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        put();

    }

    Poster poster = new Poster(2, "Steve Job", "15000", 15, 0);

    void get() {
        VolleyHttp.get(VolleyHttp.API_LIST_POST, VolleyHttp.paramsEmpty(), new VolleyHandler() {
            @Override
            public void onSuccess(String response) {
                Log.d("@@@onResponse ", response);
            }

            @Override
            public void onError(String error) {
                Log.d("@@@onErrorresponse ", error);
            }
        });
    }

    private void post() {
        VolleyHttp.post(VolleyHttp.API_CREATE_POST, VolleyHttp.paramsCreate(poster), new VolleyHandler() {
            @Override
            public void onSuccess(String response) {
                Log.d("@@@onResponse ", response);
            }

            @Override
            public void onError(String error) {
                Log.d("@@@onErrorResponse ", error);
            }
        });
    }

    private void put() {
        VolleyHttp.put(VolleyHttp.API_UPDATE_POST + poster.getId(), VolleyHttp.paramsUpdate(poster), new VolleyHandler() {
            @Override
            public void onSuccess(String response) {
                Log.d("@@@onResponse ", response);
            }

            @Override
            public void onError(String error) {
                Log.d("@@@onErrorResponse ", error);
            }
        });
    }

    private void delete() {
        VolleyHttp.del(VolleyHttp.API_DELETE_POST + poster.getId(), new VolleyHandler() {
            @Override
            public void onSuccess(String response) {
                Log.d("@@@onResponse ", response);
            }

            @Override
            public void onError(String error) {
                Log.d("@@@onErrorResponse ", error);
            }
        });
    }
}