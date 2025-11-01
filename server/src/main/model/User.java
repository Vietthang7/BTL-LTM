package model;

public class User {
    private int id;
    private String username;
    private String status;
    private boolean isActive;
    
    // Constructors, getters, setters
    public User() {}
    
    public User(int id, String username, String status, boolean isActive) {
        this.id = id;
        this.username = username;
        this.status = status;
        this.isActive = isActive;
    }
    
    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }
}