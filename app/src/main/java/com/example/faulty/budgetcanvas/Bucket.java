package com.example.faulty.budgetcanvas;

/**
 * Data object for storing values relating to Budget Buckets
 */

public class Bucket {

    private String mBucketName;
    private int mSliderValue;

    /**
     * Default constructor for Bucket Object
     * @param name is the name of the Budget Bucket object used as a label in list view sliders
     */
    public Bucket(String name) {
        mBucketName = name;
        mSliderValue = 5;
    }

    /**
     * Returns a String containing the name of the Budget Bucket.
     */
    public String getBucketName() {
        return mBucketName;
    }

    /**
     * Sets the name for the Bucket.
     * @param bucketName
     */
    public void setBucketName(String bucketName) {
        this.mBucketName = bucketName;
    }

    /**
     * Returns the slider value for this Bucket instance as an Integer.
     */
    public int getSliderValue() {
        return mSliderValue;
    }

    /**
     * Sets the sliderValue of this Bucket instance.
     * @param sliderValue
     */
    public void setSliderValue(int sliderValue) {
        this.mSliderValue = sliderValue;
    }
}
