package com.example.suyash_socialmedia.DTO;

public class UpdatePostRequest {
    private String postBody;
    private int postID;
    // Getters and setters


    public UpdatePostRequest(String postBody, int postID) {
        this.postBody = postBody;
        this.postID = postID;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }
}
