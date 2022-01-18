package com.example.intent_java_task4;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Member implements Serializable {
    String kotlin;
    String java;
    public Member(String kotlin, String java) {
        this.kotlin = kotlin;
        this.java = java;
    }

    @NonNull
    @Override
    public String toString() {
        return "Member{" +
                "kotlin='" + kotlin + '\'' +
                ", java='" + java + '\'' +
                '}';
    }
}
