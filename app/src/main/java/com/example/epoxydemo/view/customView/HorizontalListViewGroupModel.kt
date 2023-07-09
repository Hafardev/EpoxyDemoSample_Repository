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
     /*   val layoutInflater = LayoutInflater.from(binding?.root?.context)
        val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.row_horizontal_list, mLinearLayout, false)
        val itemView = binding.root
        val textView = itemView.findViewById<TextView>(R.id.tvTitle)
        textView.text = label*/
        (binding?.root as? ItemCellRecyclerBinding)?.apply {
            addTextViewToLayout(this.container)

        }
    }

    private fun addTextViewToLayout(mLinearLayout: LinearLayout){
        mLinearLayout.removeAllViews()
        val inflater = LayoutInflater.from(mLinearLayout.context)
        items.forEachIndexed { index, label ->
           // val layoutInflater = LayoutInflater.from(mLinearLayout.context)
           // val binding = DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, R.layout.row_horizontal_list, mLinearLayout, false)
            //val itemView = binding.root
            //val textView = itemView.findViewById<TextView>(R.id.tvTitle)
          // textView.text = label
            //val itemView =  DataBindingUtil.inflate(inflater, R.layout.row_horizontal_list, mLinearLayout, false) as TextView
           val itemView =  LayoutInflater.from(mLinearLayout.context).inflate(R.layout.row_horizontal_list, mLinearLayout, false) as LinearLayout
           /// val itemView =  LayoutInflater.from(mLinearLayout.context).inflate(R.layout.row_horizontal_list, mLinearLayout, false) as TextView
            //val itemView = inflater.inflate(R.layout.row_horizontal_list,mViewGroup,false) as TextView
            //itemView.id = index
            val textView =  itemView.findViewById<TextView>(R.id.tvTitle)
            //val textview = itemView.findViewById<TextView>(R.id.tvTitle)
            textView.text = label
            mLinearLayout.addView(itemView)
        }
    }
}

fun TypedEpoxyController<*>.addItemGroup(item: HorizontalListDataModel) {
    recycler {
        id("recycler")
        data(item)
    }
}