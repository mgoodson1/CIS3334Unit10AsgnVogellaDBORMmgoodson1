package edu.css.mgoodson1.cis3334_unit10asgn_vogelladb_orm_mgoodson1;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;


/**
 * Created by vogella on 06.09.17.
 *
 * @author uthor Matt Goodson
 * @version 2018-03-31
 *
 * This DAO interfaces with the table Trophy
 *
 */


@Dao
public interface TrophyDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addTrophy(Trophy trophy);

    @Query("SELECT * FROM trophy WHERE userId=:userId")
    List<Trophy> findTrophiesForUser(int userId);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateTrophy(Trophy trophy);

    @Query("delete from trophy where id = :id")
    void delete(long id);

}