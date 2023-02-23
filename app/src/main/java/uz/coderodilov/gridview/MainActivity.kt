package uz.coderodilov.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import uz.coderodilov.gridview.adapter.GridAdapter
import uz.coderodilov.gridview.data.DataProvider
import uz.coderodilov.gridview.databinding.ActivityMainBinding
import uz.coderodilov.gridview.model.ImagesModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dataProvider = DataProvider()
        val data = dataProvider.getDataList()

        val gridAdapter = GridAdapter(data, this)

        binding.gridView.adapter = gridAdapter


    }
}