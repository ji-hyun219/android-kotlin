package com.example.mytestapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List : MutableList<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(p0: Int): Any {
        return List[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var convertView = p1

        if (convertView == null) {
            convertView = LayoutInflater.from(p2?.context).inflate(R.layout.listview_item, p2, false)
        }

        val listviewText = convertView?.findViewById<TextView>(R.id.listViewTextArea)
        listviewText!!.text = List[p0]

        return convertView!!
    }

}

//getCount() - 어댑터에 의해 표시될 데이터 항목의 총 수를 반환합니다.
//getItem(int position) - 지정된 위치(position)에 있는 데이터 항목을 반환합니다.
//getItemId(int position) - 지정된 위치에 있는 항목의 ID를 반환합니다. 항목 ID는 리스트 뷰에서 항목을 참조하는 데 사용될 수 있습니다.
//getView(int position, View convertView, ViewGroup parent) - 데이터의 각 항목을 위한 뷰를 생성하거나 재사용하여 반환합니다. 이 메소드는 리스트 뷰에 항목을 표시할 때마다 호출됩니다.