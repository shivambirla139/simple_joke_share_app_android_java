package com.appdash.jokesapp;

public class JokeModel {
    private String setup;
    private String punch;

    public JokeModel(String setup, String punch) {
        this.setup = setup;
        this.punch = punch;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunch() {
        return punch;
    }

    public void setPunch(String punch) {
        this.punch = punch;
    }
}
