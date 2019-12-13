package com.st.my_json_text;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import utils.GsonUtil;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private RecyclerView recyclerView;
    private List<Home.DataBean> Mydata=new ArrayList<Home.DataBean>();
    private String url="http://barondata.com:18080/user/getUserJson";
    private MyAdapter myAdapter;

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        initView();
        initData();
        initEvent();

    }

    private void initEvent() {



    }

    private void initData() {
        AsyncHttpClient client=new AsyncHttpClient();
        client.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String result=new String(responseBody);
                Home home= GsonUtil.getGson().fromJson(result,Home.class);
                Mydata=home.getData();
                Log.i(TAG, "onSuccess: "+Mydata.get(0).getIcon());
                //里面添加
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this) );
                myAdapter = new MyAdapter(Mydata,MainActivity.this);
                recyclerView.setAdapter(myAdapter);












            }



            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i(TAG, "onFailure: 请求失败");

            }
        });

    }

    private void initView() {
        recyclerView=findViewById(R.id.recyclr);

    }
}
