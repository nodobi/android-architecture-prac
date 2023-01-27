package com.example.mvp_fragment.view.note.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.mvp_fragment.databinding.ItemNoteBinding

class NoteViewHolder(val binding: ItemNoteBinding) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(note: String) {
        binding.textviewNoteItem.text = note
    }
}