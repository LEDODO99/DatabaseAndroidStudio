package com.example.ledod.databasesideas;

import android.arch.persistence.room.*;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ledod on 28/02/2018.
 */
@Entity
public class Monsters implements Parcelable{
    @PrimaryKey
    private int uid;

    @ColumnInfo(name="nam")
    private String name;

    @ColumnInfo(name="type")
    private String type;

    @ColumnInfo(name="description")
    private String description;

    public Monsters(int uid,String name,String type,String description){
        this.uid=uid;
        this.name=name;
        this.type=type;
        this.description=description;
    }

    protected Monsters(Parcel in) {
        uid = in.readInt();
        name=in.readString();
        type = in.readString();
        description = in.readString();
    }

    public static final Creator<Monsters> CREATOR = new Creator<Monsters>() {
        @Override
        public Monsters createFromParcel(Parcel in) {
            return new Monsters(in);
        }

        @Override
        public Monsters[] newArray(int size) {
            return new Monsters[size];
        }
    };

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getUid() {
        return uid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(uid);
        parcel.writeString(name);
        parcel.writeString(type);
        parcel.writeString(description);
    }
}
