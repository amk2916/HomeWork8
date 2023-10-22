package com.example.homework8.chart

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.homework8.R

class ChartLayout : AppCompatActivity()  {

    private val list by lazy{ findViewById<ListView>(R.id.list_view)}

    val data = listOf(
        TestChartDataClass("Forever Friends", "Caption 1", "\$US 1.50"),
        TestChartDataClass("Item 2", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 3", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 4", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 5", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 6", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 7", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 8", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 9", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 10", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 11", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 12", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 13", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 14", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 15", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 16", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 17", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 18", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 19", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 20", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 21", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 22", "Caption 2", "\$US 2.00"),
        TestChartDataClass("Item 23", "Caption 2", "\$US 2.00"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chart_layout)
        val adapter = TestChartListAdapter(this, data)
        list.adapter = adapter
    }
}