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
        R.drawable.g1,
        R.drawable.g2,
        R.drawable.g3,
        R.drawable.g4,
        R.drawable.g5,
        R.drawable.g6,
        R.drawable.g7,
        R.drawable.g8,
        R.drawable.g9,
        R.drawable.g10,
    )

    private val gameTitles: List<String> = listOf(
        "Elden Ring",
        "God of War Ragnarök",
        "Vampire Survivors",
        "Marvel Snap",
        "Citizen Sleeper",
        "Neon White",
        "Horizon Forbidden West",
        "Norco",
        "Signalis",
        "Xenoblade Chronicles 3",

    )


    // Technology List
    private val technologyImages: List<Int> = listOf(
        R.drawable.t1,
        R.drawable.t2,
        R.drawable.t3,
        R.drawable.t4,
        R.drawable.t5,
        R.drawable.t6,
        R.drawable.t7,
        R.drawable.t8,
        R.drawable.t9,
        R.drawable.t10,
    )

    private val technologyTitles: List<String> = listOf(
        "Digital Twins",
        "Blockchain",
        "IoT for a hyperconnected",
        "AI and Security",
        "Quantum Computing",
        "Metaverse",
        "Superapps",
        "Robotic Process Automation",
        "New Energy Solutions",
        "Sustainable Technologies",

    )

    // Coding List
    private val codiingImages: List<Int> = listOf(
        R.drawable.c1,
        R.drawable.c2,
        R.drawable.c3,
        R.drawable.c4,
        R.drawable.c5,
        R.drawable.c6,
        R.drawable.c7,
        R.drawable.c8,
        R.drawable.c9,
        R.drawable.c10,
    )

    private val codingTitles: List<String> = listOf(
        "Javascript",
        "Python",
        "Go",
        "Java",
        "Kotlin",
        "PHP",
        "C#",
        "Swift",
        "Ruby",
        "C and C++",

    )

    // Currency List
    private val curencyImages: List<Int> = listOf(
        R.drawable.cr1,
        R.drawable.cr2,
        R.drawable.cr3,
        R.drawable.cr4,
        R.drawable.cr5,
        R.drawable.cr6,
        R.drawable.cr7,
        R.drawable.cr8,
        R.drawable.cr9,
        R.drawable.cr10,
    )

    private val currencyTitles: List<String> = listOf(
        "Bitcoin",
        "Ethereum",
        "Tether USDT",
        "USD-USDC",
        "BNB",
        "XRP",
        "BUSD",
        "ADA",
        "DOGE",
        "MATIC",

    )

    // Mobile List
    private val mobileImages: List<Int> = listOf(
        R.drawable.m1,
        R.drawable.m2,
        R.drawable.m3,
        R.drawable.m4,
        R.drawable.m5,
        R.drawable.m6,
        R.drawable.m7,
        R.drawable.m8,
        R.drawable.m9,
        R.drawable.m10,
    )

    private val mobileTitles: List<String> = listOf(
        "Google Pixel 7",
        "iPhone 14 Pro",
        "Samsung Galaxy S23",
        "Google Pixel 6a",
        "OnePlus 11",
        "iPhone 14",
        "Galaxy Z Flip 4",
        "Motorola Moto G62",
        "Vivo X80 Pro",
        "Asus Zenfone 9",
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