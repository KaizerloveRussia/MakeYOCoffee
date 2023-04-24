package com.example.makeyocoffee.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "device")
data class Device(
    @ColumnInfo(name = "device_id") @PrimaryKey(autoGenerate = true) val deviceId: Int,
    @ColumnInfo(name = "name") val name: String
)


