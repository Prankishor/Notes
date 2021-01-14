package com.example.notes

import androidx.lifecycle.LiveData
import androidx.room.*


//Basically Dao works as an interface between the Repo and Room. So all the data related property is defined here
@Dao
interface NoteDao {

    //suspend (coroutine thing) to make the function work in background thread

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: Note)

    @Delete
    suspend fun delete(note: Note)

    @Query("Select * from notes_table order by id ASC")
    fun getAllNotes(): LiveData<List<Note>> //using live data so that as soon as we create or delete note, it gets reflected on UI
}