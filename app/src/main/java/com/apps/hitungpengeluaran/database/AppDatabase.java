package com.apps.hitungpengeluaran.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.apps.hitungpengeluaran.database.dao.DatabaseDao;
import com.apps.hitungpengeluaran.model.ModelDatabase;

@Database(entities = {ModelDatabase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
