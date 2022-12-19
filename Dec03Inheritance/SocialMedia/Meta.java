package com.company.Dec03Inheritance.SocialMedia;

public class Meta
{
    private String name;
    private String id;
    private boolean canCreatePassword;

    public Meta(String name, String id, boolean canCreatePassword) {
        this.name = name;
        this.id = id;
        this.canCreatePassword = canCreatePassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isCanCreatePassword() {
        return canCreatePassword;
    }

    public void setCanCreatePassword(boolean canCreatePassword) {
        this.canCreatePassword = canCreatePassword;
    }
}
