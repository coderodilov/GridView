package uz.coderodilov.gridview.data

import uz.coderodilov.gridview.R


class DataProvider {

    private val imageList: List<Int> = listOf(
        R.drawable.one,
        R.drawable.two,
        R.drawable.three,
        R.drawable.four,
        R.drawable.five,
        R.drawable.six,
        R.drawable.seven,
        R.drawable.eight,
        R.drawable.nine,
        R.drawable.ten,
        R.drawable.eleven,
        R.drawable.twelwe,
    )

    fun getImageList(): List<Int> = imageList
}