package com.agenticidentity.mcpdomainserver;


import java.util.HashMap;
import java.util.Map;

public class ManagedIdentity {

    private final String id;
    private String displayName;
    private String email;
    private String organizationalUnitId;
    private String status;
    private final Map<String, String> attributes;

    public ManagedIdentity(String id, String displayName, String email, String organizationalUnitId) {
        this.id = id;
        this.displayName = displayName;
        this.email = email;
        this.organizationalUnitId = organizationalUnitId;
        this.status = "active";
        this.attributes = new HashMap<>();
    }

    public String getId() { return id; }
    public String getDisplayName() { return displayName; }
    public void setDisplayName(String displayName) { this.displayName = displayName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getOrganizationalUnitId() { return organizationalUnitId; }
    public void setOrganizationalUnitId(String organizationalUnitId) { this.organizationalUnitId = organizationalUnitId; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Map<String, String> getAttributes() { return attributes; }

    @Override
    public String toString() {
        return "ManagedIdentity{id='" + id + "', displayName='" + displayName + "', email='" + email
                + "', organizationalUnitId='" + organizationalUnitId + "', status='" + status + "'}";
    }
}