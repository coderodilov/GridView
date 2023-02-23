package uz.coderodilov.gridview.data

import uz.coderodilov.gridview.R
import uz.coderodilov.gridview.model.ImagesModel

class DataProvider {

    private val dataList: List<ImagesModel> = listOf(
        ImagesModel(R.drawable.one, "Happy Kid"),
        ImagesModel(R.drawable.two, "Sunny day"),
        ImagesModel(R.drawable.three, "Beauty Face"),
        ImagesModel(R.drawable.four, "Dude"),
        ImagesModel(R.drawable.five, "Photoshop"),
        ImagesModel(R.drawable.six, "Passport Size"),
        ImagesModel(R.drawable.seven, "Young Couple"),
        ImagesModel(R.drawable.eight, "Engineer")
    )

    fun getDataList(): List<ImagesModel> = dataList
}