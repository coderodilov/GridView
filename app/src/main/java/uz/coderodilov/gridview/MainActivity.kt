package uz.coderodilov.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
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
        val data = dataProvider.getImageList()

        val gridAdapter = GridAdapter(data, this)

        binding.gridView.adapter = gridAdapter

        binding.btnGridThree.setOnClickListener{
            binding.gridView.numColumns = 3
        }

        binding.btnGridTwo.setOnClickListener{
            binding.gridView.numColumns = 2
        }
    }
}