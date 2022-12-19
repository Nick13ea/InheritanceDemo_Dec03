package com.company.Dec03Inheritance.SocialMedia;

public class Facebook extends Instagram
{
    private int madeYear;
    public Facebook(String name, String id, boolean canCreatePassword) {
        super(name, id, canCreatePassword);
        this.getCanVideoCall();
        this.madeYear=2006;
    }
    public int getmadeYear(){
        return madeYear;
    }
    public void setMadeYear(int i){
        this.madeYear=madeYear;

    }

    public static void main(String[] args) {
        Facebook facebook=new Facebook("nick","123",false);
        System.out.println(facebook.madeYear);
        facebook.setMadeYear(1222);
        System.out.println(facebook.getCanVideoCall());
        System.out.println(facebook.isCanCreatePassword());
        System.out.println(facebook.getmadeYear());
    }
}
