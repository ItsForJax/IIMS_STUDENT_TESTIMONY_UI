package com.epds.dev.iims_student_testimony_ui.buttonbasedchatbot.dataclass;

import java.util.List;

public abstract class ChatItem {
    public static class User extends ChatItem {
        public String message;

        public User(String message) {
            this.message = message;
        }
    }

    public static class Bot extends ChatItem {
        public String message;

        public Bot(String message) {
            this.message = message;
        }
    }

    public static class Options extends ChatItem {
        public List<String> questions;

        public Options(List<String> questions) {
            this.questions = questions;
        }
    }

    public static class Form extends ChatItem {
        public Form() {
        }
    }
}
