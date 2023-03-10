package com.example.mvp_fragment.data.source.note

import com.example.mvp_fragment.data.NoteItem

interface NoteDataSource {
    suspend fun getNotes(): Result<List<NoteItem>>
    suspend fun getNotes(date: String) : Result<List<NoteItem>>
    suspend fun saveNote(item: NoteItem)
    suspend fun getNote(noteId: String): Result<NoteItem>
    suspend fun updateNoteTitleDetail(noteId: String, title: String, detail: String)
    suspend fun deleteNote(noteId: String)
    suspend fun setFavorite(noteId: String, isFavorite: Boolean)
    suspend fun getFavoriteNotes(): Result<List<NoteItem>>
}