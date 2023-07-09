package com.example.epoxydemo.controller

import com.airbnb.epoxy.TypedEpoxyController
import com.example.epoxydemo.*
import com.example.epoxydemo.dataClass.*
import com.example.epoxydemo.view.customView.HorizontalViewGroupModel
import com.example.epoxydemo.view.customView.addItemGroup

class EpoxyDemoController(private val listener: EpoxyControllerListener) :
    TypedEpoxyController<List<BaseModel>>() {

    override fun buildModels(data: List<BaseModel>) {
        data.forEach { dataModel ->
            when (dataModel) {
                is HeaderDataModel -> addHeader(dataModel)
                is TitleDataModel -> addTitle(dataModel)
                is SubtitleDataModel -> addSubtitle(dataModel)
                is SectionTitleDataModel -> addSectionTitle(dataModel)
                is HorizontalItemGroupDataModel -> addItemGroup(dataModel)
                is InfoDataModel -> addInfo(dataModel)
                is DescriptionDataModel -> addDescription(dataModel)
                is ItemDataModel -> addItem(dataModel, listener)
            }
        }
    }


    private fun addHeader(dataModel: HeaderDataModel) {
        header {
            id("header")
            data(dataModel)
        }
    }

    private fun addTitle(dataModel: TitleDataModel) {
        title {
            id("title")
            data(dataModel)
        }
    }

    private fun addSubtitle(dataModel: SubtitleDataModel) {
        subtitle {
            id("subtitle")
            data(dataModel)
        }
    }

    private fun addSectionTitle(dataModel: SectionTitleDataModel) {
        sectionTitle {
            id("sectionTitle/${dataModel.title}")
            data(dataModel)
        }
    }

    private fun addInfo(dataModel: InfoDataModel) {
        info {
            id("info")
            data(dataModel)
        }
    }


    private fun addDescription(dataModel: DescriptionDataModel) {
        description {
            id("description/${dataModel.descriptionTitle}")
            data(dataModel)
        }
    }

    private fun addItem(dataModel: ItemDataModel, listener: EpoxyControllerListener) {
        item {
            id(dataModel.id)
            data(dataModel)
            onClickListener(listener)
        }
    }

    interface EpoxyControllerListener {
        fun onItemClick(itemName: String)
    }
}