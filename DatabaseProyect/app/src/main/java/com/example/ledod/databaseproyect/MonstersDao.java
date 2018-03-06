package com.example.ledod.databasesideas;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by ledod on 28/02/2018.
 */
@Dao
public interface MonstersDao{
    @Query("SELECT * FROM monsters")
    List<Monsters> getAll();

    @Query("SELECT * FROM monsters WHERE uid IN (:userIds)")
    List<Monsters> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM monsters where nam LIKE :mName")
    List<Monsters> loadByName(String mName);

    @Insert
    void insterAll(Monsters ... monsters);

    @Delete
    void delete(Monsters monsters);


}
