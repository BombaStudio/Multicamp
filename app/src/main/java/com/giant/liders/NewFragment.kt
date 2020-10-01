package com.giant.liders

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_new.*
import kotlinx.android.synthetic.main.item_article.view.*


class NewFragment : Fragment(R.layout.fragment_new) {

    private val args by navArgs<NewFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageViewNew.imageBanner.load(args.article.banner)
        imageView2.imageBanner.load(args.article.leaders.photo)
        textViewLeader.text = args.article.description
        textView3.text = args.article.leaders.name
    }
}