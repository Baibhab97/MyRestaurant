package com.example.baibhab.myrestaurant;

/* Created by Baibhab Debnath*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class plain extends AppCompatActivity {

    TextView plain_list_var;
    String plain_data;

    private RequestQueue mQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plain);

        plain_list_var = findViewById(R.id.plain_list);

        mQueue = Volley.newRequestQueue(this);

        fetchingData();
    }

    void fetchingData(){


        String url = "https://api.myjson.com/bins/14fb4b";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = response.getJSONArray("plain");

                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject plain = jsonArray.getJSONObject(i);

                                plain_data = plain.getString("layer4");

                                plain_list_var.append(plain_data + "\n\n");
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        mQueue.add(request);
        Toast.makeText(getApplicationContext(),"Success", Toast.LENGTH_SHORT).show();
    }
}
