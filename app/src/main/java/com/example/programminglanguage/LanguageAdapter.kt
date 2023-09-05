package com.example.programminglanguage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LanguageAdapter(private val context: Context, private val language: List<Language>, val listener: (Language) -> Unit): RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {

    class LanguageViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgLanguage = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameLanguage = view.findViewById<TextView>(R.id.tv_item_name)
        val descLanguage = view.findViewById<TextView>(R.id.tv_item_description)
        fun bindView(language: Language, listener: (Language) -> Unit){
            imgLanguage.setImageResource(language.imgLanguage)
            nameLanguage.text = language.nameLanguage
            descLanguage.text = language.descLanguage

            itemView.setOnClickListener {
                listener(language)
            }
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LanguageAdapter.LanguageViewHolder {
        return LanguageViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_language, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LanguageAdapter.LanguageViewHolder, position: Int) {
        holder.bindView(language[position], listener)
    }

    override fun getItemCount(): Int = language.size

    }

