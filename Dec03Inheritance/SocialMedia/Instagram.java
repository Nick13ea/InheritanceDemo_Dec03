package com.company.Dec03Inheritance.SocialMedia;

public class Instagram extends Meta{

    private boolean canVideoCall;


    public Instagram(String name, String id, boolean canCreatePassword) {
        super(name, id, canCreatePassword);
        this.canVideoCall=true;
    }

    public boolean getCanVideoCall() {
        return canVideoCall;
    }

    public void setCanVideoCall(boolean canVideoCall) {
        this.canVideoCall = canVideoCall;
    }
}
