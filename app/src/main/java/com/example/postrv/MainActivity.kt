package com.example.postrv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.postrv.databinding.FacebookTimelineBinding
import com.example.postrv.model.Post

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PostAdapter
    private lateinit var list:List<Post>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.facebook_timeline)
        recyclerView=findViewById(R.id.rv_posts)
        list= mutableListOf()
        (list as MutableList<Post>).add(Post(R.drawable.profile,"Welcome to my world",11.5))
        (list as MutableList<Post>).add(Post(R.drawable.profile,"Welcome to my world",11.5))
        (list as MutableList<Post>).add(Post(R.drawable.profile,"Welcome to my world",11.5))
        (list as MutableList<Post>).add(Post(R.drawable.profile,"Welcome to my world",11.5))
        (list as MutableList<Post>).add(Post(R.drawable.profile,"Welcome to my world",11.5))
        (list as MutableList<Post>).add(Post(R.drawable.profile,"Welcome to my world",11.5))
        (list as MutableList<Post>).add(Post(R.drawable.profile,"Welcome to my world",11.5))
        (list as MutableList<Post>).add(Post(R.drawable.profile,"Welcome to my world",11.5))
        (list as MutableList<Post>).add(Post(R.drawable.profile,"Welcome to my world",11.5))
        (list as MutableList<Post>).add(Post(R.drawable.profile,"Welcome to my world",11.5))
        adapter= PostAdapter(list)
        recyclerView.adapter=adapter
        recyclerView.layoutManager=LinearLayoutManager(this)

    }
    }

