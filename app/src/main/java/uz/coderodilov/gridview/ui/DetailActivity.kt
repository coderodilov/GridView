package uz.coderodilov.gridview.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import uz.coderodilov.gridview.MainActivity
import uz.coderodilov.gridview.R
import uz.coderodilov.gridview.adapter.ViewPagerAdapter
import uz.coderodilov.gridview.data.DataProvider
import uz.coderodilov.gridview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private var counter: Int = 0
    private var imageList: List<Int>? = null
    private var titleList: List<String>? = null
    private var index : Int = 0
    private var indexList : Int = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val dataProvider = DataProvider()

        indexList = intent.getIntExtra("indexList", 1)
        imageList = dataProvider.getImageList(indexList)
        titleList = dataProvider.getTitleList(indexList)

        val viewPagerAdapter = ViewPagerAdapter(imageList!!, titleList!!, applicationContext)

        imageList = dataProvider.getImageList(1)
        index = intent.getIntExtra("index", 0)

        loadViewPagerSettings(viewPagerAdapter)
        binding.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                setPlayerTitle(position)
                setupCurrentIndicator(position)
                swipeRight()
                swipeLeft()

            }

            override fun onPageSelected(position: Int) {}
            override fun onPageScrollStateChanged(state: Int) {}
        })

        binding.btnBack.setOnClickListener{
            onBackPressed()
        }
    }

    //region ViewPager
    private fun loadViewPagerSettings(viewPagerAdapter: ViewPagerAdapter) {
        binding.viewPager.adapter = viewPagerAdapter
        binding.viewPager.currentItem = index
        setupIndicator()
        setupCurrentIndicator(index)
    }

    private fun swipeLeft() {
        binding.btnLeft.setOnClickListener {
            if (counter > 0) {
                counter--
                binding.viewPager.currentItem = counter
            } else {
                Toast.makeText(applicationContext, "This is first page", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun swipeRight() {
        binding.btnRight.setOnClickListener {
            if (counter < imageList!!.size - 1) {
                counter++
                binding.viewPager.currentItem = counter
            } else {
                Toast.makeText(applicationContext, "This is last page", Toast.LENGTH_SHORT).show()
            }
        }
    }


    private fun setPlayerTitle(position: Int) {
        var id = position
        counter = position
        id++
        binding.playerId.text =  String.format("Top $id/${imageList!!.size}")
    }

    //endregion

    //region Indicator
    private fun setupIndicator() {
        val indicators = arrayOfNulls<ImageView>(imageList!!.size)
        val layoutParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        layoutParams.setMargins(0,0,24,0)
        for (i in indicators.indices) {
            indicators[i] = ImageView(applicationContext)
            indicators[i]?.setImageDrawable(
                ContextCompat.getDrawable(
                    applicationContext,
                    R.drawable.indicator
                )
            )
            binding.indicatorContainer.addView(indicators[i])
            indicators[i]?.layoutParams = layoutParams
        }
    }


    private fun setupCurrentIndicator(position: Int){
        val childCound = binding.indicatorContainer.childCount

        for (i in 0 until childCound){
            val indicator = binding.indicatorContainer.getChildAt(i) as ImageView
            if (i == position){
                indicator.setImageDrawable(
                    ContextCompat.getDrawable(applicationContext, R.drawable.indicator_selected))
            } else {
                indicator.setImageDrawable(
                    ContextCompat.getDrawable(applicationContext, R.drawable.indicator))
            }
        }
    }
    //endregion


}