package com.example.mvp_fragment.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mvp_fragment.util.DateFormatter
import java.time.LocalDate
import java.util.UUID

@Entity(tableName = "note_table")
data class NoteItem constructor(
    @ColumnInfo("title") var title: String,
    @ColumnInfo("detail") var detail: String,
    @ColumnInfo("date") var date: String = DateFormatter.localDateToString(LocalDate.now()),
    @PrimaryKey
    @ColumnInfo("id") var id: String = UUID.randomUUID().toString()
) {
    @ColumnInfo(name = "favorite")
    var isFavorite = false
}