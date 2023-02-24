package uz.coderodilov.gridview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import uz.coderodilov.gridview.R
import uz.coderodilov.gridview.data.DataProvider
import java.util.Objects

class ViewPagerAdapter(context: Context): PagerAdapter() {

    private val dataProvider = DataProvider()
    private val imageList = dataProvider.getImageList()
    private val titleList = dataProvider.getTitleList()
    private var layoutInflater : LayoutInflater? = null


    init {
        layoutInflater =  context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getCount(): Int {
       return imageList.size
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {

        return view == obj as LinearLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = layoutInflater?.inflate(R.layout.view_pager_style, container, false)
        val imageView = view!!.findViewById<ImageView>(R.id.imageView_VP)
        val textView = view.findViewById<TextView>(R.id.tvImageTitle_Vp)

        imageView.setImageResource(imageList[position])
        textView.text = titleList[position]

        Objects.requireNonNull(container).addView(view)
        return view
    }


    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as LinearLayout)
    }

}