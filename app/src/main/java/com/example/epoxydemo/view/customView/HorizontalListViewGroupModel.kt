package com.example.epoxydemo.view.customView

import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.airbnb.epoxy.DataBindingEpoxyModel
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.TypedEpoxyController
import com.example.epoxydemo.R
import com.example.epoxydemo.dataClass.HorizontalListDataModel
import com.example.epoxydemo.databinding.ItemCellRecyclerBinding
import com.example.epoxydemo.recycler


@EpoxyModelClass
abstract class HorizontalViewGroupModel : DataBindingEpoxyModel() {

    @EpoxyAttribute
    lateinit var items: List<String>

    override fun getDefaultLayout() = R.layout.item_cell_recycler

    override fun setDataBindingVariables(binding: ViewDataBinding?) {
        (binding?.root as? ItemCellRecyclerBinding)?.apply {
            addTextViewToLayout(this.container)

        }
    }

    private fun addTextViewToLayout(mLinearLayout: LinearLayout){
        mLinearLayout.removeAllViews()
        items.forEachIndexed { index, label ->
            val itemView =  LayoutInflater.from(mLinearLayout.context).inflate(R.layout.row_horizontal_list, mLinearLayout, false) as LinearLayout
            val textView =  itemView.findViewById<TextView>(R.id.tvTitle)
            textView.text = label
            mLinearLayout.addView(itemView)
        }
    }
}

fun TypedEpoxyController<*>.addItemViewGroup(item: HorizontalListDataModel) {
    recycler {
        id("recycler")
        data(item)
    }
}