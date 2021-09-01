package com.example.tour_guide_nepal.ENTITY

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity
data class HotelBookDetails (
    @ColumnInfo(name = "_id") val _id:String? = null,
    @ColumnInfo(name = "fullname") val fullname:String? = null,
    @ColumnInfo(name = "email") val email:String? = null,
    @ColumnInfo(name = "phone") val phone:String? = null,
    @ColumnInfo(name = "hotelname") val hotelname:String? = null,
    @ColumnInfo(name = "roomtype") val roomtype:String? = null,
    @ColumnInfo(name = "datefrom") val datefrom:String? = null,
    @ColumnInfo(name = "dateto") val dateto:String? = null,
    @ColumnInfo(name = "numberofpeople") val numberofpeople:String? = null,
    @ColumnInfo(name = "comments") val comments:String? = null,
):Parcelable {
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
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(_id)
        parcel.writeString(fullname)
        parcel.writeString(email)
        parcel.writeString(phone)
        parcel.writeString(hotelname)
        parcel.writeString(roomtype)
        parcel.writeString(datefrom)
        parcel.writeString(dateto)
        parcel.writeString(numberofpeople)
        parcel.writeString(comments)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<HotelBookDetails> {
        override fun createFromParcel(parcel: Parcel): HotelBookDetails {
            return HotelBookDetails(parcel)
        }

        override fun newArray(size: Int): Array<HotelBookDetails?> {
            return arrayOfNulls(size)
        }
    }
}