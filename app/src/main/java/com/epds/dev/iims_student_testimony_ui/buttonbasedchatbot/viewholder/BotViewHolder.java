package com.epds.dev.iims_student_testimony_ui.buttonbasedchatbot.viewholder;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.epds.dev.iims_student_testimony_ui.R;

public class BotViewHolder extends MainViewHolder {
    public TextView botTextView;
    public BotViewHolder(@NonNull View itemView) {
        super(itemView);
        this.botTextView = itemView.findViewById(R.id.bot_message);
    }
}

