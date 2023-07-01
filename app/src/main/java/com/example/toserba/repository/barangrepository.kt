package com.example.toserba.repository

import com.example.toserba.dao.barangdao
import com.example.toserba.list.barang
import kotlinx.coroutines.flow.Flow

class barangrepository(private val barangdao: barangdao) {
    val allBarang: Flow<List<barang>> =barangdao.getAllbarang()
    suspend fun insertbarang(barang: barang) {
        barangdao.insertbarang(barang)
    }

    suspend fun deletebarang(barang: barang) {
        barangdao.deletebarang(barang)
    }

    suspend fun updatbarang(barang: barang) {
        barangdao.updatebarang(barang)
    }
}