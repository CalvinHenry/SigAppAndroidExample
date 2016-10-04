package com.example.henry89.sigappsexample;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.view.*;

import java.util.*;

import static com.example.henry89.sigappsexample.R.id.chat_item_content;

/**
 * Created by henry89 on 10/4/16.
 */
public class ChatRecyclerAdapter extends RecyclerView.Adapter{
    List<String> mMessages = new ArrayList<>();

    class ChatViewHolder extends RecyclerView.ViewHolder {
        TextView chatItemContent;

        public ChatViewHolder(View itemView){
            super(itemView);
            chatItemContent = (TextView) itemView.findViewById(chat_item_content);
        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chat_item, parent,false);
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ChatViewHolder chatViewHolder = (ChatViewHolder)holder;
        chatViewHolder.chatItemContent.setText(mMessages.get(position));
    }

    @Override
    public int getItemCount() {
        return mMessages.size();
    }

    public void addMessage(String message){
        mMessages.add(message);
        notifyDataSetChanged();
    }


}
