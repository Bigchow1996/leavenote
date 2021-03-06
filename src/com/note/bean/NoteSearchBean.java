package com.note.bean;

public class NoteSearchBean {
    private String timeType;
    private String startTime;
    private String endTime;
     private String classes;

    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public String getStartTime() {
    	if(this.startTime == null) return "";
    	else return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
    	if(this.endTime == null) return "";
    	else return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getClasses() {
        if(this.classes == null) return "";
        else return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}