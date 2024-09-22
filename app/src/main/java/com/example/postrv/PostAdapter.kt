package com.example.postrv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.postrv.model.Post

class PostAdapter (var PostsList : List<Post>):RecyclerView.Adapter<PostAdapter.facebookViewHolder>(){
    class facebookViewHolder(val PostView: View): RecyclerView.ViewHolder(PostView){
        var profileImg:ImageView=PostView.findViewById(R.id.profile_image)
        var postImg:ImageView=PostView.findViewById(R.id.img_post)
        var shareImg:ImageView=PostView.findViewById(R.id.profile_image2)
        var time:TextView=PostView.findViewById(R.id.time_ic)
        var postText:TextView=PostView.findViewById(R.id.text_post)


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): facebookViewHolder {
        val postView = LayoutInflater.from(parent.context).inflate(R.layout.activity_main,parent,false)
        return facebookViewHolder(postView)
    }

    override fun getItemCount(): Int {
        return PostsList.size
    }

    override fun onBindViewHolder(holder: facebookViewHolder, position: Int) {
        val post = PostsList[position]
        holder.time.text= post.time.toString()
        holder.postImg.setImageResource(post.profile_img)
        holder.profileImg.setImageResource(post.profile_img)
        holder.shareImg.setImageResource(post.profile_img)
        holder.postText.text=post.post_text


    }
}