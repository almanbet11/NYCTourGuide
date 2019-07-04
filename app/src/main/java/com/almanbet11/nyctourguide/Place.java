package com.almanbet11.nyctourguide;

public class Place {
    private String nameOfPlace;
    private String locationAndState;
    private String info;
    private String latitude;
    private String longitude;
    private int imageResourceId;
    private boolean isOpen = false;



    public Place(String nameOfPlace, String locationAndState,String info, int imageResourceId){
        this.nameOfPlace = nameOfPlace;
        this.locationAndState = locationAndState;
        this.info = info;
        this.imageResourceId = imageResourceId;
    }

    public String getNameOfPlace(){
        return nameOfPlace;
    }

    public String getLocationAndState(){
        return locationAndState;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public void setState(boolean isOpen){
        this.isOpen = isOpen;
    }

    public boolean getState(){
        return isOpen;
    }

    public String getInfo(){return info;}

    public String getGeoLocation(){
        return String.format("geo:%s,%s", latitude, longitude);
    }

}
