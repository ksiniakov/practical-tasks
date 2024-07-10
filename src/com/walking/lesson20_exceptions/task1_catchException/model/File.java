package com.walking.lesson20_exceptions.task1_catchException.model;

public class File {
    private String name;
    private int size;
    private MediaType type;

    public File(String name, int size, MediaType type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return """
                name: %s
                size: %d
                type: %s
                """.formatted(
                name, size, type.name());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MediaType getType() {
        return type;
    }

    public void setType(MediaType type) {
        this.type = type;
    }
}
