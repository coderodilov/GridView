package uz.coderodilov.gridview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.coderodilov.gridview.adapter.GridAdapter
import uz.coderodilov.gridview.data.DataProvider
import uz.coderodilov.gridview.databinding.ActivityMainBinding
import uz.coderodilov.gridview.ui.DetailActivity
import uz.coderodilov.gridview.ui.HomeActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var index: Int = 0
    private var title:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        index = intent.getIntExtra("index", 1)
        title = intent.getStringExtra("title")

        val dataProvider = DataProvider()
        val imageList = dataProvider.getImageList(index)
        val gridAdapter = GridAdapter(imageList, this)

        binding.gridView.adapter = gridAdapter
        binding.gridView.smoothScrollByOffset(100)
        binding.title.text = title

        binding.btnBack.setOnClickListener {
           onBackPressed()
        }

        binding.btnGridThree.setOnClickListener {
            3.changeColumnCount()
        }

        binding.btnGridTwo.setOnClickListener {
            2.changeColumnCount()
        }

        binding.gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("index", position)
            intent.putExtra("indexList", index)
            startActivity(intent)

        }

    }

    private fun Int.changeColumnCount() {
        binding.gridView.numColumns = this
    }

}