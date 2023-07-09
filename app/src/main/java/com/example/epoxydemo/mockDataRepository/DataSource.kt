package com.example.epoxydemo.mockDataRepository

import com.example.epoxydemo.dataClass.*

class DataSource() {

    fun provideDataSource() : List<BaseModel> {
        val horizontalItems = listOf("سنتوری", "کلاه قرمزی", "زیر پوست شهر")
        val dataSourceList = mutableListOf<BaseModel>()
        dataSourceList.add(HeaderDataModel("https://www.filimo.com/assets/web/ui/img-9eIjEWWuyDB7x3DL6bCw/campaigns/info99/desktop/desktop-poster7.jpg" ))
        dataSourceList.add(TitleDataModel("با فیلیمو بی وقفه فیلم ببین!", "کنترل همیشه در دست توست !"))
        dataSourceList.add(SubtitleDataModel("۸۵ هزار فیلم و سریال برای دانلود و تماشا داری ... میتونی دانلود کنی بعدا ببینی...!!"))
        dataSourceList.add(SectionTitleDataModel("سینمایی"))
        dataSourceList.add(InfoDataModel("مهمان مامان", "داریوش مهرجویی"))
        dataSourceList.add(InfoDataModel("جهان با من برقص", "سروش صحت"))
        dataSourceList.add(HorizontalListDataModel(horizontalItems))
        dataSourceList.add(HorizontalItemGroupDataModel(listOf( "سینما جهان","عاشقانه","سینما خانگی","سریال", "فیلم", "سینمایی", "انیمیشن", "مستند")))
        dataSourceList.add(DescriptionDataModel("دنیایی متنوع از فیلم و کارتون های کودکانه", "دروازه نیوکمپ به روی سرچشمه ها بسته میشه اما درست وقتی که فکر میکنن رویاهاشون تموم شده، رویای پرنده باش از راه میرسه!"))
        dataSourceList.add(DescriptionDataModel("سینما آنلاین فیلیمو", " تمامی فیلم و سریال های فیلیمو برای مشترکین ایرانسل رایگان است"))
        dataSourceList.add(SectionTitleDataModel("فیلم و سریال"))
        dataSourceList.add(ItemDataModel(10, "https://dkstatics-private.digikala.com/digikala-marketplace-sellers-documents/be49c730de5e33c237437f86ba263e5417fbcec5_1596551319.jpg?OSSAccessKeyId=LTAIPClJziKGRUZJ&Expires=1907591320&Signature=FAP4sbr%2F1pT5NYMSCuEBLQmUKC4%3D", "فرار از زندان", "درام آمریکایی ساختهٔ پل شیورینگ"))
        dataSourceList.add(ItemDataModel(11, "https://upload.wikimedia.org/wikipedia/commons/1/1c/Joker-filimo-logo.png", "گیم آف ترونز", "آمریکایی-درام ساخته دیوید بنیاف"))
        dataSourceList.add(ItemDataModel(12, "https://dkstatics-private.digikala.com/digikala-marketplace-sellers-documents/be49c730de5e33c237437f86ba263e5417fbcec5_1596551319.jpg?OSSAccessKeyId=LTAIPClJziKGRUZJ&Expires=1907591320&Signature=FAP4sbr%2F1pT5NYMSCuEBLQmUKC4%3D", "فرار از زندان", "درام آمریکایی ساختهٔ پل شیورینگ"))
        return  dataSourceList
    }
}