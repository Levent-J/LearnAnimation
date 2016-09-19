package com.levent_j.learnanimation;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by levent_j on 16-9-19.
 */
public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.mViewHolder>{
    private Context context;

    DemoAdapter(Context context){
        this.context=context;
    }

    @Override
    public mViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_demo,parent,false);
        return new mViewHolder(view);
    }

    @Override
    public void onBindViewHolder(mViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class mViewHolder extends RecyclerView.ViewHolder{

        public mViewHolder(View itemView) {
            super(itemView);
        }
    }
}
