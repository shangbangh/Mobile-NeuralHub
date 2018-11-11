package com.example.shangbao.neuralhub.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shangbao.neuralhub.Models.NNObject;
import com.example.shangbao.neuralhub.Models.Network;
import com.example.shangbao.neuralhub.R;

import java.util.ArrayList;

public class NNAdapter extends RecyclerView.Adapter<NNAdapter.NNView> {
    private ArrayList<NNObject> mNNObjects = new ArrayList<>();
    private Context mContext;

    public NNAdapter(Context context) {
        mContext = context;
    }

    public NNAdapter(Context context, ArrayList<NNObject> list) {
        mContext = context;
        this.setmNNObjects(list);
    }

    public void add(NNObject nnObject, int index) {
        this.mNNObjects.add(index, nnObject);
    }

    public void remove(int index) {
        this.mNNObjects.remove(index);
    }

    public ArrayList<NNObject> getmNNObjects() {
        return mNNObjects;
    }

    public void setmNNObjects(ArrayList<NNObject> mNNObjects) {
        this.mNNObjects = mNNObjects;
    }

    @NonNull
    @Override
    public NNView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.content_main, parent, false);
        NNView viewHolder = new NNView(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NNView holder, int position) {
        holder.bindToView(mNNObjects.get(position));
    }

    @Override
    public int getItemCount() {
        return mNNObjects.size();
    }

    protected class NNView extends RecyclerView.ViewHolder {

        public NNView(View itemView) {
            super(itemView);
        }

        public void bindToView(NNObject nnObject) {
        }
    }
}
