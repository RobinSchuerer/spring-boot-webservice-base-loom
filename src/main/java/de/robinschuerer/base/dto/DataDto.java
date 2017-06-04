package de.robinschuerer.base.dto;

public class DataDto {

    private String id;

    public DataDto() {

    }

    public DataDto(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }
}
