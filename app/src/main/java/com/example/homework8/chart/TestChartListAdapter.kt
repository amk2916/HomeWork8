package com.example.homework8.chart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.homework8.R

class TestChartListAdapter(
    private val context: Context,
    private val items: List<TestChartDataClass>
) : BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): TestChartDataClass {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item_layout, parent, false)
        val item = getItem(position)

        val titleText = view.findViewById<TextView>(R.id.TitleText)
        val caption = view.findViewById<TextView>(R.id.caption)
        val cost = view.findViewById<TextView>(R.id.CostText)


        titleText.text = item.titleText
        caption.text = item.caption
        cost.text = item.costText

        return view
    }
}