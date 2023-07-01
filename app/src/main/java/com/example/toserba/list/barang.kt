package com.example.toserba.list

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "barang-table")
data class barang (
    @PrimaryKey(autoGenerate = true)
    val Namabarang: String,
    val Jumlahbarang: Int=0,
    val Hargabarang: Int=0,
) : Parcelable