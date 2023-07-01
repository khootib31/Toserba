package com.example.toserba.dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.toserba.list.barang
import kotlinx.coroutines.flow.Flow
interface barangdao {
    @Query("SELECT * FROM `barang-table` ORDER BY Namabarang ASC")
    fun getAllbarang():Flow<List<barang>>

    @Insert
    suspend fun insertbarang(barang: barang)

    @Delete
    suspend fun deletebarang( barang: barang)

    @Update
    fun updatebarang(barang: barang)
}