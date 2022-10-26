package com.example.zeve;

public class MissionData {

    private int missionImgId;
    private String missionTitle;
    private String missionContent;
    private String missionPoint;
    private String missionSuccess;

    public int getMissionImgId() {
        return missionImgId;
    }

    public String getMissionTitle() {
        return missionTitle;
    }

    public String getMissionContent() {
        return missionContent;
    }

    public String getMissionPoint() {
        return missionPoint;
    }

    public String getMissionSuccess() {
        return missionSuccess;
    }

    public void setMissionImgId(int missionImgId) {
        this.missionImgId = missionImgId;
    }

    public void setMissionTitle(String missionTitle) {
        this.missionTitle = missionTitle;
    }

    public void setMissionContent(String missionContent) {
        this.missionContent = missionContent;
    }

    public void setMissionPoint(String missionPoint) {
        this.missionPoint = missionPoint;
    }

    public void setMissionSuccess(String missionSuccess) {
        this.missionSuccess = missionSuccess;
    }
}
