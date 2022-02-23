package com.objis.demo.rest.tp9;

public class Track
{
    private String title;
    private String singer;

    public Track(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    public Track() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Track{" +
                "title='" + title + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
