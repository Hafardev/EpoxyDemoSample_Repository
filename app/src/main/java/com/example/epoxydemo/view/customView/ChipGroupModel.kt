package com.example.epoxydemo.view.customView

import android.view.LayoutInflater
import androidx.core.view.ViewCompat
import androidx.databinding.ViewDataBinding
import com.airbnb.epoxy.DataBindingEpoxyModel
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.TypedEpoxyController
import com.example.epoxydemo.R
import com.example.epoxydemo.dataClass.ChipGroupDataModel
import com.example.epoxydemo.databinding.ItemCellChipGroupBinding
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup


@EpoxyModelClass
abstract class ChipGroupModel : DataBindingEpoxyModel() {
    @EpoxyAttribute
    lateinit var chips: List<String>

    override fun getDefaultLayout() = R.layout.item_cell_chip_group

    override fun setDataBindingVariables(binding: ViewDataBinding?) {
        (binding as? ItemCellChipGroupBinding)?.apply {
            addChipsCells(this.chipGroup)
        }
    }

    private fun addChipsCells(chipGroup: ChipGroup){
        chipGroup.removeAllViews()
        val inflater = LayoutInflater.from(chipGroup.context)
        chips.forEachIndexed { index, label ->
            val chip = inflater.inflate(R.layout.view_chip,chipGroup,false) as Chip
            chip.id = index
            chip.text = label
            chip.isAllCaps = true
            chip.isCheckable = false
            ViewCompat.setElevation(chip, 0.0f)
            chipGroup.addView(chip)
        }
    }
}

fun TypedEpoxyController<*>.addChipGroup(cell: ChipGroupDataModel) {
    chipGroup {
        id("chipGroup")
        chips(cell.chips)
    }
}