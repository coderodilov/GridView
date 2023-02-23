package uz.coderodilov.gridview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import uz.coderodilov.gridview.R

import uz.coderodilov.gridview.model.ImagesModel

@Suppress("NAME_SHADOWING")
class GridAdapter(private var itemImagesModel: List<ImagesModel>, context: Context): BaseAdapter() {

    //Layout inflater yaratish
    private var layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int{
        return itemImagesModel.size
    }

    override fun getItem(position: Int): Any {
        return itemImagesModel[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        var view = view
        if (view == null){
            view = layoutInflater.inflate(R.layout.grid_view_item, viewGroup, false)
        }
        val tvImageTitle = view?.findViewById<TextView>(R.id.tvImageTitle)
        val imageView = view?.findViewById<ImageView>(R.id.imageViewGridAdapter)

        tvImageTitle!!.text = itemImagesModel[position].name
        imageView!!.setImageResource(itemImagesModel[position].image)

        return view!!
    }
}