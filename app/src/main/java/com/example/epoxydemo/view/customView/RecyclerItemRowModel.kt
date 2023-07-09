/*
package com.example.epoxydemo.view.customView

import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.epoxydemo.R
import com.example.epoxydemo.dataClass.HorizontalListDataModel


@EpoxyModelClass(layout = R.layout.row_horizontal_list)
abstract class RecyclerItemRowModel (@EpoxyAttribute var dataModel: HorizontalListDataModel) : EpoxyModelWithHolder<RecyclerItemRowModel.CustomHolder>(){
    override fun bind(holder: CustomHolder) {
        holder.titleView.text = dataModel.title
    }

    inner class CustomHolder : BaseHolder(){
        val titleView by bind<TextView>(R.id.tvTitle)
    }

}


*/
