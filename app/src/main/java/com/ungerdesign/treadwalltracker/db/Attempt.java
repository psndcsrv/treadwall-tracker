package com.ungerdesign.treadwalltracker.db;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.time.OffsetDateTime;

@Entity(foreignKeys = @ForeignKey(entity = Activity.class,
        parentColumns = "id",
        childColumns = "activityId"))
public class Attempt {
    @PrimaryKey
    private int id;
    private int activityId;
    private OffsetDateTime startTime;
    private int timeElapsed;
    private int attemptNumber;

    public Attempt(int id, int activityId, OffsetDateTime startTime, int timeElapsed, int attemptNumber) {
        this.id = id;
        this.activityId = activityId;
        this.startTime = startTime;
        this.timeElapsed = timeElapsed;
        this.attemptNumber = attemptNumber;
    }

    public Attempt(int id, int activityId, OffsetDateTime startTime, int attemptNumber) {
        this.id = id;
        this.activityId = activityId;
        this.startTime = startTime;
        this.attemptNumber = attemptNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public int getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(int timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public void setAttemptNumber(int attemptNumber) {
        this.attemptNumber = attemptNumber;
    }
}
