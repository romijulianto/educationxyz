package com.romijulianto.educationxyz.course

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.romijulianto.educationxyz.R

class CourseAdapter(private val ListCourse: ArrayList<Course>) : RecyclerView.Adapter<CourseAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater
            .from(viewGroup.context)
            .inflate(R.layout.activity_course, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ListCourse.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, rating, photo, summary, detail) = ListCourse[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvRate.text = rating

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, CourseDetail::class.java)
            moveDetail.putExtra(CourseDetail.EXTRA_RATING, rating)
            moveDetail.putExtra(CourseDetail.EXTRA_NAME, name)
            moveDetail.putExtra(CourseDetail.EXTRA_PHOTO, photo)
            moveDetail.putExtra(CourseDetail.EXTRA_DETAIL, detail)
            moveDetail.putExtra(CourseDetail.EXTRA_SUMMARY, summary)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvRate: TextView = itemView.findViewById(R.id.tv_item_rate)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

}