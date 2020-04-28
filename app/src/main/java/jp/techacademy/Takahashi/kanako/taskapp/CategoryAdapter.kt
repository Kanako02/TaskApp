package jp.techacademy.Takahashi.kanako.taskapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView



class CategoryAdapter(context: Context) : ArrayAdapter() {

//LayoutInflaterを定義
    private val mLayoutInflater: LayoutInflater

//Categoryクラスのlistを定義
    val categorylist = mutableListOf<Category>()

    init {
        this.mLayoutInflater = LayoutInflater.from(context)
    }

//    override fun getCount(): Int {
//        return categorylist.size
//    }

//    override fun getItem(position: Int): Any {
//        return categoryList[position]
//    }
////
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?) {
//        val view: View =
//            convertView ?: mLayoutInflater.inflate(android.R.layout.simple_spinner_item, null)
//
//    }

    val adapter = ArrayAdapter<String>(
        this, android.R.layout.simple_spinner_item, categorylist
    )


}
