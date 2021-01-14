package com.example.notes

import androidx.lifecycle.LiveData

// This is basically a (GODAM) or storehouse where we will store data coming from various sources so that our viewModel has to not take tension

class NoteRepository(private val noteDao: NoteDao) {

    val allNotes: LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun insert(note: Note){
        noteDao.insert(note)
    }

    suspend fun delete(note: Note){
        noteDao.delete(note)
    }
}