package com.example.toserba.application

import android.app.Application
import com.example.toserba.repository.barangrepository

class BarangApp: Application() {
    val database by lazy { BarangDatabase.getDatabase(this) }
    val repository by lazy { barangrepository(database.barangdao()) }
}