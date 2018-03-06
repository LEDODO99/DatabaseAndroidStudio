package com.example.ledod.databasesideas;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ledod on 28/02/2018.
 */
@Entity
public class Debilidades implements Parcelable {
    @PrimaryKey
    private int uid;

    @ColumnInfo(name = "fire")
    private int fireW;

    @ColumnInfo(name = "water")
    private int waterW;

    @ColumnInfo(name = "thunder")
    private int thunW;

    @ColumnInfo(name = "ice")
    private int iceW;

    @ColumnInfo(name = "dragon")
    private int dragonW;

    public int getFireW() {
        return fireW;
    }

    public int getDragonW() {
        return dragonW;
    }

    public int getIceW() {
        return iceW;
    }

    public int getThunW() {
        return thunW;
    }

    public int getUid() {
        return uid;
    }

    public int getWaterW() {
        return waterW;
    }

    public void setDragonW(int dragonW) {
        this.dragonW = dragonW;
    }

    public void setFireW(int fireW) {
        this.fireW = fireW;
    }

    public void setIceW(int iceW) {
        this.iceW = iceW;
    }

    public void setThunW(int thunW) {
        this.thunW = thunW;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setWaterW(int waterW) {
        this.waterW = waterW;
    }

    protected Debilidades(Parcel in) {
        uid = in.readInt();
        fireW = in.readInt();
        waterW = in.readInt();
        thunW = in.readInt();
        iceW = in.readInt();
        dragonW = in.readInt();
    }

    public static final Creator<Debilidades> CREATOR = new Creator<Debilidades>() {
        @Override
        public Debilidades createFromParcel(Parcel in) {
            return new Debilidades(in);
        }

        @Override
        public Debilidades[] newArray(int size) {
            return new Debilidades[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(uid);
        parcel.writeInt(fireW);
        parcel.writeInt(waterW);
        parcel.writeInt(thunW);
        parcel.writeInt(iceW);
        parcel.writeInt(dragonW);
    }
}
