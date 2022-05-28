package com.geektech.homework62

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.URLUtil
import android.widget.Toast
import com.bumptech.glide.Glide
import com.geektech.homework62.databinding.ActivityMainBinding
import java.net.URI
import java.net.URLClassLoader
import java.net.URLConnection

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var listUrl: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        random()

        binding.btnClick.setOnClickListener {
            if (URLUtil.isValidUrl(binding.etTitle.text.toString())) {
                val url = Uri.parse(binding.etTitle.text.toString())
                Glide.with(this).load(url)
                    .into(binding.ivGoogle)
            } else {
                Toast.makeText(this, getString(R.string.toast), Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnRandom.setOnClickListener{
            val random = (0 until listUrl.size - 1).random()
            Glide.with(this).load(listUrl[random])
                .into(binding.ivGoogle)
        }
    }

    fun random(){
        listUrl.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png")
        listUrl.add("https://png.pngtree.com/png-vector/20201229/ourmid/pngtree-an-adult-tabby-cat-png-image_2664939.jpg")
        listUrl.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png")
        listUrl.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png")
        listUrl.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png")
        listUrl.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png")
        listUrl.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png")
        listUrl.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png")
        listUrl.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png")
        listUrl.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png")
        listUrl.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png")
        listUrl.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/PNG_transparency_demonstration_1.png/240px-PNG_transparency_demonstration_1.png")
    }
}