package com.ungerdesign.treadwalltracker.db;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

public interface AttemptDao {

    @Insert
    public void insertAttempts(Attempt... attempts);

    @Update
    public void updateAttempts(Attempt... attempts);

    @Delete
    public void deleteAttempts(Attempt... attempts);
}
