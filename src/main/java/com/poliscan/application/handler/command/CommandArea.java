package com.poliscan.application.handler.command;

public class CommandArea {

    private String name;
    private String description;

    public CommandArea(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
