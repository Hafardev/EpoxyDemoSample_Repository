package com.example.epoxydemo.mockDataRepository

import com.example.epoxydemo.dataClass.*

class DataSource() {

    fun provideUIData() : List<BaseModel> {
        val horizontalItems = listOf("سنتوری", "کلاه قرمزی", "زیر پوست شهر")
        val dataList = mutableListOf<BaseModel>()
       //  dataList.add(HeaderDataModel("https://miro.medium.com/max/7848/1*r_rq_fRLNliX91GSgMi38Q.jpeg"))
        dataList.add(HeaderDataModel("https://www.filimo.com/assets/web/ui/img-9eIjEWWuyDB7x3DL6bCw/campaigns/info99/desktop/desktop-poster7.jpg" ))
        dataList.add(TitleDataModel("با فیلیمو بی وقفه فیلم ببین!", "کنترل همیشه در دست توست !"))
        dataList.add(SubtitleDataModel("۸۵ هزار فیلم و سریال برای دانلود و تماشا داری ... میتونی دانلود کنی بعدا ببینی...!!"))
        dataList.add(SectionTitleDataModel("سینمایی"))
        dataList.add(InfoDataModel("مهمان مامان", "داریوش مهرجویی"))
        dataList.add(InfoDataModel("جهان با من برقص", "سروش صحت"))
        dataList.add(HorizontalListDataModel(horizontalItems))
        //dataList.add(CartDataModel("1"))
        dataList.add(ChipGroupDataModel(listOf("Tactical skill", "strategy", "Luck")))
        dataList.add(DescriptionDataModel("دنیایی متنوع از فیلم و کارتون های کودکانه", "دروازه نیوکمپ به روی سرچشمه ها بسته میشه اما درست وقتی که فکر میکنن رویاهاشون تموم شده، رویای پرنده باش از راه میرسه!"))
        dataList.add(DescriptionDataModel("سینما آنلاین فیلیمو", " تمامی فیلم و سریال های فیلیمو برای مشترکین ایرانسل رایگان است"))
        dataList.add(SectionTitleDataModel("فیلم و سریال"))
        dataList.add(ItemDataModel(10, "https://dkstatics-private.digikala.com/digikala-marketplace-sellers-documents/be49c730de5e33c237437f86ba263e5417fbcec5_1596551319.jpg?OSSAccessKeyId=LTAIPClJziKGRUZJ&Expires=1907591320&Signature=FAP4sbr%2F1pT5NYMSCuEBLQmUKC4%3D", "فرار از زندان", "درام آمریکایی ساختهٔ پل شیورینگ"))
        dataList.add(ItemDataModel(11, "https://upload.wikimedia.org/wikipedia/commons/1/1c/Joker-filimo-logo.png", "گیم آف ترونز", "آمریکایی-درام ساخته دیوید بنیاف"))
        dataList.add(ItemDataModel(12, "https://dkstatics-private.digikala.com/digikala-marketplace-sellers-documents/be49c730de5e33c237437f86ba263e5417fbcec5_1596551319.jpg?OSSAccessKeyId=LTAIPClJziKGRUZJ&Expires=1907591320&Signature=FAP4sbr%2F1pT5NYMSCuEBLQmUKC4%3D", "فرار از زندان", "درام آمریکایی ساختهٔ پل شیورینگ"))
        return  dataList
    }
}