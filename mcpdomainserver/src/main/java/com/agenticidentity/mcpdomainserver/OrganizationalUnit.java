package com.agenticidentity.mcpdomainserver;


public class OrganizationalUnit {

    private final String id;
    private String name;

    public OrganizationalUnit(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "OrganizationalUnit{id='" + id + "', name='" + name + "'}";
    }
}