package com.example.administrator.ad0220;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by Administrator on 2017/2/20.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Dog> mDogList;

    public MyAdapter(List<Dog> mDogList){
        this.mDogList=mDogList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.dog_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Dog dog=mDogList.get(position);
        holder.mTextView.setText(dog.dogName);
        holder.mImageView.setImageResource(dog.dogimg);
    }

    @Override
    public int getItemCount() {
        return mDogList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageView= (ImageView) itemView.findViewById(R.id.iv_Img);
            mTextView= (TextView) itemView.findViewById(R.id.tv_Name);
        }
    }
}
