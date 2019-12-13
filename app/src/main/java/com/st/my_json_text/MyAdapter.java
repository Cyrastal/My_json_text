package com.st.my_json_text;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Home.DataBean> mData;
    private Context context;
    private LayoutInflater minfalter;

    public MyAdapter(List<Home.DataBean> mData, Context context) {
        this.mData = mData;
        this.context = context;
        minfalter=  LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = minfalter.inflate(R.layout.list_detail, parent, false);
        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Home.DataBean dataBean=mData.get(position);
        Picasso.with(context).load(Config.baseurl+dataBean.getIcon()).into(holder.imageView);


        holder.age.setText(String.valueOf(dataBean.getAge()));
        holder.birthday.setText(dataBean.getBirthday());
        holder.name.setText(dataBean.getName());
        holder.desc.setText(dataBean.getDesc());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView name;
        public TextView birthday;
        public TextView desc;
        public TextView age;
        public ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            birthday=itemView.findViewById(R.id.bir);
            desc=itemView.findViewById(R.id.desc);
            age=itemView.findViewById(R.id.age);
            imageView=itemView.findViewById(R.id.image_my);
        }
    }

}
