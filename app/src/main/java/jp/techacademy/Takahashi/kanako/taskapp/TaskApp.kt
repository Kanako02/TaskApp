package jp.techacademy.Takahashi.kanako.taskapp

import android.app.Application
import android.content.Context
import io.realm.Realm

class TaskApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }


}