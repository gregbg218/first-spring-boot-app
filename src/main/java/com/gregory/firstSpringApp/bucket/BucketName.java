package com.gregory.firstSpringApp.bucket;

public enum BucketName {

    PROFILE_IMAGE("trial-bucket-app");

    private final String bucketName;

    BucketName(String bucketName)
    {
        this.bucketName=bucketName;
    }
}
