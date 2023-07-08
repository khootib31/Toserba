package com.example.toserba.application

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.toserba.dao.barangdao
import com.example.toserba.list.barang


@Database(entities = [barang::class ], version = 1, exportSchema = false)
abstract class BarangDatabase: RoomDatabase() {
    abstract fun barangdao(): barangdao

    companion object{
        private var INSTANCE: BarangDatabase? = null

        fun getDatabase(context: Context): BarangDatabase {
            return INSTANCE ?: synchronized(this) {
               val  instance = Room.databaseBuilder(
                   context.applicationContext,
                   BarangDatabase::class.java,
                   "barang_database"
               )
                   .allowMainThreadQueries()
                   .build()

                INSTANCE =instance
                instance

            }
        }
    }
}