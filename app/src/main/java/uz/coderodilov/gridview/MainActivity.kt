package uz.coderodilov.gridview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import uz.coderodilov.gridview.adapter.GridAdapter
import uz.coderodilov.gridview.data.DataProvider
import uz.coderodilov.gridview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dataProvider = DataProvider()
        val imageList = dataProvider.getImageList()

        val gridAdapter = GridAdapter(imageList, this)

        binding.gridView.adapter = gridAdapter

        binding.btnGridThree.setOnClickListener {
            3.changeColumnCount()
        }

        binding.btnGridTwo.setOnClickListener {
            2.changeColumnCount()
        }

        binding.gridView.setOnItemClickListener { _, _, _, _ ->
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }

    }

    private fun Int.changeColumnCount() {
        binding.gridView.numColumns = this
    }
}