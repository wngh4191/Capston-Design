package com.example.mysololife.comment

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.LinearLayout
import android.widget.TextView
import com.example.mysololife.R
import com.example.mysololife.utils.FBAuth

class CommentLVAdapter(val commentlist : MutableList<CommentModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return commentlist.size
    }

    override fun getItem(position: Int): Any {
        return commentlist[position]
    }

    override fun getItemId(position : Int): Long {
       return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        if (view == null){
        view = LayoutInflater.from(parent?.context).inflate(R.layout.comment_list_item, parent, false)
        }
        val title = view?.findViewById<TextView>(R.id.titleArea)
        val time = view?.findViewById<TextView>(R.id.timeArea)

        title!!.text = commentlist[position].commentTitle
        time!!.text = commentlist[position].commentcreatedTime

        return view!!

    }

}