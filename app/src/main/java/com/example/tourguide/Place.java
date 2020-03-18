package com.example.tourguide;

public class Place {

    private int mImageResourceId;
    private String mName;
    private String mDescription;
    private String mLocation;
    private String mWorkingHours;
    private String mPhoneNo;

    public Place(int mImageResourceId, String mName, String mDescription, String mLocation, String mWorkingHours, String mPhoneNo) {
        this.mImageResourceId = mImageResourceId;
        this.mName = mName;
        this.mDescription = mDescription;
        this.mLocation = mLocation;
        this.mWorkingHours = mWorkingHours;
        this.mPhoneNo = mPhoneNo;
    }


    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmWorkingHours() {
        return mWorkingHours;
    }

    public String getmPhoneNo() {
        return mPhoneNo;
    }
}
