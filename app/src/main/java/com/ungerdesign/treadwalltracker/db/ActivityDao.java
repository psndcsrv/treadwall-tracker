package com.ungerdesign.treadwalltracker.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

@Dao
public interface ActivityDao {

    @Insert
    public void insertActivities(Activity... activities);

    @Update
    public void updateActivities(Activity... activities);

    @Delete
    public void deleteActivities(Activity... activities);
}
