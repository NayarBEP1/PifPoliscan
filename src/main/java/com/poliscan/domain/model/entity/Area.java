package com.poliscan.domain.model.entity;

public class Area {

    private String id;
    private String name;
    private String description;

    private final String ERROR_NAME_IS_MANDATORY = "Error: Area name is mandatory";
    private final String ERROR_DESCRIPTION_IS_MANDATORY = "Error: Description is mandatory";

    public Area(String id, String name, String description) {
        dataValidator(name, description);
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Area(String name, String description) {
        dataValidator(name, description);
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    private void dataValidator(String name, String description){
        DataValidator.isMandatory(name, ERROR_NAME_IS_MANDATORY);
        DataValidator.isMandatory(description, ERROR_DESCRIPTION_IS_MANDATORY);
    }
}
