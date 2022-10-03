package com.valterc.ki2.fragments.devices.list;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.valterc.ki2.R;

public class ListDevicesViewHolder extends RecyclerView.ViewHolder {

    private final View baseView;
    private final ImageView imageViewIcon;
    private final TextView textViewName;
    private final TextView textViewConnectionStatus;
    private final ImageButton buttonRemove;
    private final ImageButton buttonConfigure;

    public ListDevicesViewHolder(@NonNull View itemView) {
        super(itemView);

        baseView = itemView;
        imageViewIcon = itemView.findViewById(R.id.imageview_list_devices_item_icon);
        textViewName = itemView.findViewById(R.id.textview_list_devices_item_name);
        textViewConnectionStatus = itemView.findViewById(R.id.textview_list_devices_item_connection_status);
        buttonRemove = itemView.findViewById(R.id.imagebutton_list_devices_item_remove);
        buttonConfigure = itemView.findViewById(R.id.imagebutton_list_devices_item_info);
    }

    public View getRootView(){
        return baseView;
    }

    public ImageView getImageViewIcon() {
        return imageViewIcon;
    }

    public TextView getTextViewName() {
        return textViewName;
    }

    public TextView getTextViewConnectionStatus() {
        return textViewConnectionStatus;
    }

    public ImageButton getButtonRemove() {
        return buttonRemove;
    }

    public ImageButton getButtonConfigure() {
        return buttonConfigure;
    }
}