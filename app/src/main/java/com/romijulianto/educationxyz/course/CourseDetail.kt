package com.romijulianto.educationxyz.course

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.romijulianto.educationxyz.R

class CourseDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_detail)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Course"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvSetIden: TextView = findViewById(R.id.tv_set_detail)
        val tvSummary: TextView = findViewById(R.id.tv_set_summary)
        val tvRating: TextView = findViewById(R.id.tv_item_rating)

        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getStringExtra(EXTRA_PHOTO)
        val tIDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tSummary = intent.getStringExtra(EXTRA_SUMMARY)
        val tRating = intent.getStringExtra(EXTRA_RATING)



        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvSetIden.text = tIDetail
        tvSummary.text = tSummary
        tvRating.text = tRating
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_SUMMARY = "extra_summary"
        const val EXTRA_RATING = "extra_rating"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}