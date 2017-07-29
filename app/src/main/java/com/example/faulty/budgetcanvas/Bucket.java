package com.example.faulty.budgetcanvas;

/**
 * Data object for storing values relating to Budget Buckets
 */

public class Bucket {

    private String mBucketName;
    private int mSliderValue;

    public Bucket(String name) {
        mBucketName = name;
        mSliderValue = 5;
    }

    public String getmBucketName() {
        return mBucketName;
    }

    public void setmBucketName(String mBucketName) {
        this.mBucketName = mBucketName;
    }

    public int getmSliderValue() {
        return mSliderValue;
    }

    public void setmSliderValue(int mSliderValue) {
        this.mSliderValue = mSliderValue;
    }
}
