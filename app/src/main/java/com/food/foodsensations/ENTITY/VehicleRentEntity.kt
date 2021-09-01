package com.example.tour_guide_nepal.ENTITY

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity
data class VehicleRentEntity (
    @ColumnInfo(name = "_id") val _id:String? = null,
    @ColumnInfo(name = "title") val title:String? = null,
    @ColumnInfo(name = "fullname") val fullname:String? = null,
    @ColumnInfo(name = "email") val email:String? = null,
    @ColumnInfo(name = "phone") val phone:String? = null,
    @ColumnInfo(name = "numberofpeople") val numberofpeople:String? = null,
    @ColumnInfo(name = "vehicletype") val vehicletype:String? = null,
    @ColumnInfo(name = "numberofvehicle") val numberofvehicle:String? = null,
    @ColumnInfo(name = "tripstartdate") val tripstartdate:String? = null,
    @ColumnInfo(name = "tripenddate") val tripenddate:String? = null,
    @ColumnInfo(name = "tripdetail") val traveldetail:String? = null,
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(_id)
        parcel.writeString(title)
        parcel.writeString(fullname)
        parcel.writeString(email)
        parcel.writeString(phone)
        parcel.writeString(numberofpeople)
        parcel.writeString(vehicletype)
        parcel.writeString(numberofvehicle)
        parcel.writeString(tripstartdate)
        parcel.writeString(tripenddate)
        parcel.writeString(traveldetail)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<VehicleRentEntity> {
        override fun createFromParcel(parcel: Parcel): VehicleRentEntity {
            return VehicleRentEntity(parcel)
        }

        override fun newArray(size: Int): Array<VehicleRentEntity?> {
            return arrayOfNulls(size)
        }
    }
}