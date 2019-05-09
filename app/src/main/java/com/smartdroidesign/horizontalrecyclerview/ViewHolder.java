package com.smartdroidesign.horizontalrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder {

    CircleImageView image;
    TextView name;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        this.image = itemView.findViewById(R.id.list_item_image);
        this.name = itemView.findViewById(R.id.list_item_text);
    }
}
