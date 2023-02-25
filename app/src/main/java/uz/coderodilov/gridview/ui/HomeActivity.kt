package uz.coderodilov.gridview.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import uz.coderodilov.gridview.MainActivity
import uz.coderodilov.gridview.R
import uz.coderodilov.gridview.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = Intent(applicationContext, MainActivity::class.java)

        binding.btnFootball.setOnClickListener {
            intent.putExtra("index", 1)
            intent.putExtra("title", "Players")
            startActivity(intent)

        }

        binding.btnGames.setOnClickListener{
            intent.putExtra("index", 2)
            intent.putExtra("title", "Games")
            startActivity(intent)

        }

        binding.btnTechnology.setOnClickListener {
            intent.putExtra("index", 3)
            intent.putExtra("title", "Technology")
            startActivity(intent)

        }

        binding.btnCoding.setOnClickListener {
            intent.putExtra("index", 4)
            intent.putExtra("title", "Coding")
            startActivity(intent)

        }

        binding.btnCurrency.setOnClickListener{
            intent.putExtra("index", 5)
            intent.putExtra("title", "Currency")
            startActivity(intent)

        }

        binding.btnMobile.setOnClickListener{
            intent.putExtra("index", 6)
            intent.putExtra("title", "Mobile")
            startActivity(intent)

        }
    }

}
