@file:Suppress("NAME_SHADOWING")

package uz.coderodilov.gridview.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import uz.coderodilov.gridview.R

class GridAdapter(private val imageList: List<Int>,
                   private val context: Context): BaseAdapter() {

    private var layoutInflater: LayoutInflater? = null

    override fun getCount(): Int {
        return imageList.size
    }

    override fun getItem(position: Int): Any {
        return imageList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0L
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        var view = view
        if (layoutInflater == null){
            layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }

        view = layoutInflater?.inflate(R.layout.grid_view_item, viewGroup, false)

        val imageView = view?.findViewById<ImageView>(R.id.imageViewGridAdapter)
        imageView!!.setImageResource(imageList[position])

        return view!!
    }
}