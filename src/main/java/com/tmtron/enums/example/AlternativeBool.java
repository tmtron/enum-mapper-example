package com.tmtron.enums.example;

public enum AlternativeBool {

    ON {
        @Override
        public String getGermanName() {
            return "ein";
        }
    }, OFF {
        @Override
        public String getGermanName() {
            return "aus";
        }
    };

    public abstract String getGermanName();
}