package com.example.notes

import androidx.lifecycle.LiveData

class NoteRepository(private val notesDao: NotesDao) {
    val getAllNotes: LiveData<List<Note>> = notesDao.getAllNotes()

    suspend fun insert(note: Note) {
        notesDao.insert(note)
    }

    suspend fun delete(note : Note) {
        notesDao.delete(note)
    }
}