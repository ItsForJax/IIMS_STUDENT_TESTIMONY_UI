package com.epds.dev.iims_student_testimony_ui.buttonbasedchatbot.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.epds.dev.iims_student_testimony_ui.R;
public class UserViewHolder extends MainViewHolder {
    public TextView userMessage;
    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        this.userMessage = itemView.findViewById(R.id.user_message);
    }
}
