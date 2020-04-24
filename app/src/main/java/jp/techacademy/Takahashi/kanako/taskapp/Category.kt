package jp.techacademy.Takahashi.kanako.taskapp

import android.os.Parcel
import android.os.Parcelable
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.io.Serializable

open class Category() : RealmObject(), Serializable {

    //var category: String =""

    @PrimaryKey
    var id: Int = 0

}
