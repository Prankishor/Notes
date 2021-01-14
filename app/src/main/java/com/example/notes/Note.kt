package com.example.notes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
//Write column info only if you externally want to name your column or else it will take up the same name as variable name

class Note(@ColumnInfo(name = "text")val text: String){
           //here autoGenerate automatically generates id's so we don't need to pass id
           //@PrimaryKey(autoGenerate = true) val id: Int) { //so i am getting it out of constructor since we don't need to pass id
    @PrimaryKey(autoGenerate = true) var id = 0

    //So a table is made. Now repository (according to architecture) will access this table using DAO
}