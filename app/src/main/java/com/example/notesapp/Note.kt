package com.example.notesapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val title: String,
    // Modifikasi: kolom baru untuk isi catatan
    val note: String
)