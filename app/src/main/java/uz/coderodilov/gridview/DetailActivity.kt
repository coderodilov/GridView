package uz.coderodilov.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.coderodilov.gridview.adapter.ViewPagerAdapter
import uz.coderodilov.gridview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val viewPagerAdapter = ViewPagerAdapter(applicationContext)
        binding.viewPager.adapter = viewPagerAdapter
    }
}