package com.mobile.uas_mobile.database;

public interface QueryResponse<T> {
    void onSuccess(T data);
    void onFailure(String message);
}