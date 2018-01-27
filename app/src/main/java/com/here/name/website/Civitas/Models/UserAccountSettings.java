package com.here.name.website.Civitas.Models;

import android.os.Parcelable;
import android.os.Parcel;

/**
 * Created by Charles on 7/3/2017.
 */

public class UserAccountSettings implements Parcelable {

    private String description;
    private String display_name;
    private long followers;
    private long following;
    private long posts;
    private String profile_photo;
    private String username;
    private String user_id;

    public UserAccountSettings(String description, String display_name, long followers,
                               long following, long posts, String profile_photo, String username,
                               String user_id) {
        this.description = description;
        this.display_name = display_name;
        this.followers = followers;
        this.following = following;
        this.posts = posts;
        this.profile_photo = profile_photo;
        this.username = username;
        this.user_id = user_id;
    }

    public UserAccountSettings() {

    }


    protected UserAccountSettings(Parcel in) {
        description = in.readString();
        display_name = in.readString();
        followers = in.readLong();
        following = in.readLong();
        posts = in.readLong();
        profile_photo = in.readString();
        username = in.readString();
        user_id = in.readString();
    }

    public static final Creator<UserAccountSettings> CREATOR = new Creator<UserAccountSettings>() {
        @Override
        public UserAccountSettings createFromParcel(Parcel in) {
            return new UserAccountSettings(in);
        }

        @Override
        public UserAccountSettings[] newArray(int size) {
            return new UserAccountSettings[size];
        }
    };

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public long getFollowers() {
        return followers;
    }

    public void setFollowers(long followers) {
        this.followers = followers;
    }

    public long getFollowing() {
        return following;
    }

    public void setFollowing(long following) {
        this.following = following;
    }

    public long getPosts() {
        return posts;
    }

    public void setPosts(long posts) {
        this.posts = posts;
    }

    public String getProfile_photo() {
        return profile_photo;
    }

    public void setProfile_photo(String profile_photo) {
        this.profile_photo = profile_photo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserAccountSettings{" +
                "description='" + description + '\'' +
                ", display_name='" + display_name + '\'' +
                ", followers=" + followers +
                ", following=" + following +
                ", posts=" + posts +
                ", profile_photo='" + profile_photo + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(description);
        parcel.writeString(display_name);
        parcel.writeLong(followers);
        parcel.writeLong(following);
        parcel.writeLong(posts);
        parcel.writeString(profile_photo);
        parcel.writeString(username);
        parcel.writeString(user_id);
    }
}
