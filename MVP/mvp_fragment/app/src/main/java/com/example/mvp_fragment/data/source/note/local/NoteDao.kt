package com.example.mvp_fragment.data.source.note.local

import androidx.room.*
import com.example.mvp_fragment.data.NoteItem

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note: NoteItem)

    @Query("DELETE FROM note_table WHERE id = :id")
    fun deleteNote(id: String)

    @Query("SELECT * FROM note_table")
    fun getNotes(): List<NoteItem>

    @Query("SELECT * FROM note_table WHERE id = :id")
    fun getNote(id: String): NoteItem?

    @Query("UPDATE note_table SET title = :title, detail = :detail WHERE id = :id")
    fun updateNoteTitleDetail(id: String, title: String, detail: String)

    @Query("UPDATE note_table SET favorite = :favorite WHERE id = :id")
    fun updateFavorite(id: String, favorite: Boolean)

    @Query("SELECT * FROM note_table WHERE favorite = 1")
    fun getFavoriteNotes(): List<NoteItem>

    @Query("SELECT * FROM note_table WHERE date = :date")
    fun getNotes(date: String): List<NoteItem>
}
