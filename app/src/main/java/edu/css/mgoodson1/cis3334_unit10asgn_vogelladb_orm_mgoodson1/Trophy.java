package edu.css.mgoodson1.cis3334_unit10asgn_vogelladb_orm_mgoodson1;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;


/**
 * Created by vogella on 06.09.17.
 *
 * @author uthor Matt Goodson
 * @version 2018-03-31
 *
 * This creates a database table tronpy which has a FK to User and stores the number of trophys the user has
 *
 */


@Entity(tableName = "trophy",
        foreignKeys = {
                @ForeignKey(
                        entity = User.class,
                        parentColumns = "id",
                        childColumns = "userId",
                        onDelete = ForeignKey.CASCADE
                )},
        indices = { @Index(value = "id")}
)
public class Trophy {

    @PrimaryKey(autoGenerate = true)
    long id;

    public long userId;

    String description;

    public Trophy(long userId, String description) {
        this.userId = userId;
        this.description = description;
    }
}