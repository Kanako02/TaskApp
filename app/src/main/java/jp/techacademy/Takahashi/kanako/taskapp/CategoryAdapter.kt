package jp.techacademy.Takahashi.kanako.taskapp

import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.EditText
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class CategoryAdapter (context: Context): BaseAdapter() {
    private val mLayoutInflater: LayoutInflater
    var categoryList = mutableListOf<Category>()

    init {
        this.mLayoutInflater = LayoutInflater.from(context)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: mLayoutInflater.inflate(R.layout.simple_list_item_1, null)

        val textView1 = view.findViewById<TextView>(R.id.text1)


        textView1.text = categoryList[position].category




        return view
    }

    //mTaskListのサイズ
    override fun getCount(): Int {
        return categoryList.size
    }

    //mTaskListの要素
    override fun getItem(position: Int): Any {
        return categoryList[position]
    }

    //getItemIdメソッドではidを返す
    override fun getItemId(position: Int): Long {
        return categoryList[position].id.toLong()
    }

}