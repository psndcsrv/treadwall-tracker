package com.ungerdesign.treadwalltracker.db;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Activity {
    @PrimaryKey
    private int id;
    private int priorActivityLevel;
    private int assessmentStart;
    private int assessmentDuring;
    private String notes;

    public Activity(int id, int priorActivityLevel, int assessmentStart, int assessmentDuring, String notes) {
        this.id = id;
        this.priorActivityLevel = priorActivityLevel;
        this.assessmentStart = assessmentStart;
        this.assessmentDuring = assessmentDuring;
        this.notes = notes;
    }

    @Ignore
    public Activity(int id, int priorActivityLevel, int assessmentStart) {
        this.id = id;
        this.priorActivityLevel = priorActivityLevel;
        this.assessmentStart = assessmentStart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getPriorActivityLevel() {
        return priorActivityLevel;
    }

    public void setPriorActivityLevel(int priorActivityLevel) {
        this.priorActivityLevel = priorActivityLevel;
    }

    public int getAssessmentStart() {
        return assessmentStart;
    }

    public void setAssessmentStart(int assessmentStart) {
        this.assessmentStart = assessmentStart;
    }

    public int getAssessmentDuring() {
        return assessmentDuring;
    }
    public void setAssessmentDuring(int assessmentDuring) {
        this.assessmentDuring = assessmentDuring;
    }
}
