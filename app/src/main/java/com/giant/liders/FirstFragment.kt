package com.giant.liders

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.giant.liders.data.LidersApi
import com.giant.liders.data.RetrofitProvider
import com.giant.liders.data.model.Article
import com.giant.liders.data.model.ArticlesResponse
import kotlinx.coroutines.launch
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launch {
            val response: ArticlesResponse = RetrofitProvider.lidersApi.ArticlesResponse()
            rev.adapter = ArticlesAdapter(response.articles.orEmpty().toMutableList()){
                rev.adapter = ArticlesAdapter(response.articles.orEmpty().toMutableList()) {
                    val direction = FirstFragmentDirections.actionFirstFragmentToNewFragment(it)
                    findNavController().navigate(direction)
                }

            }
        }
    }
}
