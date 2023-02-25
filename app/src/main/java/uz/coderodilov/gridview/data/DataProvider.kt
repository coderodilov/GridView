package uz.coderodilov.gridview.data

import uz.coderodilov.gridview.R


class DataProvider {

    // Football List
    private val footballImages: List<Int> = listOf(
        R.drawable.f1,
        R.drawable.f2,
        R.drawable.f3,
        R.drawable.f4,
        R.drawable.f5,
        R.drawable.f6,
        R.drawable.f7,
        R.drawable.f8,
        R.drawable.f9,
        R.drawable.f10,
    )

    private val footballTitles: List<String> = listOf(
       "Lionel Messi",
       "Karim Benzema",
       "Kylian Mbappe",
       "Erling Haaland",
       "Kevin De Bruyne",
       "Vinicius Junior",
       "Robert Lewandowski",
       "Sadio Mane",
       "Rafael Leao",
       "Neymar da Silva",
    )


    // Games List
    private val gameImages: List<Int> = listOf(
        R.drawable.f1,
        R.drawable.f2,
        R.drawable.f3,
        R.drawable.f4,
        R.drawable.f5,
        R.drawable.f6,
        R.drawable.f7,
        R.drawable.f8,
        R.drawable.f9,
        R.drawable.f10,
    )

    private val gameTitles: List<String> = listOf(
        "games",
        "games",
        "games",
        "games",
        "games",
        "games",
        "games",
        "games",
        "games",
        "games",

    )


    // Technology List
    private val technologyImages: List<Int> = listOf(
        R.drawable.f1,
        R.drawable.f2,
        R.drawable.f3,
        R.drawable.f4,
        R.drawable.f5,
        R.drawable.f6,
        R.drawable.f7,
        R.drawable.f8,
        R.drawable.f9,
        R.drawable.f10,
    )

    private val technologyTitles: List<String> = listOf(
        "technology",
        "technology",
        "technology",
        "technology",
        "technology",
        "technology",
        "technology",
        "technology",
        "technology",
        "technology",

    )

    // Coding List
    private val codiingImages: List<Int> = listOf(
        R.drawable.f1,
        R.drawable.f2,
        R.drawable.f3,
        R.drawable.f4,
        R.drawable.f5,
        R.drawable.f6,
        R.drawable.f7,
        R.drawable.f8,
        R.drawable.f9,
        R.drawable.f10,
    )

    private val codingTitles: List<String> = listOf(
        "coding",
        "coding",
        "coding",
        "coding",
        "coding",
        "coding",
        "coding",
        "coding",
        "coding",
        "coding",

    )

    // Currency List
    private val curencyImages: List<Int> = listOf(
        R.drawable.f1,
        R.drawable.f2,
        R.drawable.f3,
        R.drawable.f4,
        R.drawable.f5,
        R.drawable.f6,
        R.drawable.f7,
        R.drawable.f8,
        R.drawable.f9,
        R.drawable.f10,
    )

    private val currencyTitles: List<String> = listOf(
        "currency",
        "currency",
        "currency",
        "currency",
        "currency",
        "currency",
        "currency",
        "currency",
        "currency",
        "currency",

    )

    // Mobile List
    private val mobileImages: List<Int> = listOf(
        R.drawable.f1,
        R.drawable.f2,
        R.drawable.f3,
        R.drawable.f4,
        R.drawable.f5,
        R.drawable.f6,
        R.drawable.f7,
        R.drawable.f8,
        R.drawable.f9,
        R.drawable.f10,
    )

    private val mobileTitles: List<String> = listOf(
        "mobile",
        "mobile",
        "mobile",
        "mobile",
        "mobile",
        "mobile",
        "mobile",
        "mobile",
        "mobile",
        "mobile",
    )



    fun getTitleList(index:Int): List<String> {
        return when(index){
            1 -> footballTitles
            2 -> gameTitles
            3 -> technologyTitles
            4 -> codingTitles
            5 -> currencyTitles
            6 -> mobileTitles
            else -> {footballTitles}
        }
    }
    fun getImageList(index:Int): List<Int>{
        return when(index){
            1 -> footballImages
            2 -> gameImages
            3 -> technologyImages
            4 -> codiingImages
            5 -> curencyImages
            6 -> mobileImages
            else -> {footballImages}
        }
    }

}