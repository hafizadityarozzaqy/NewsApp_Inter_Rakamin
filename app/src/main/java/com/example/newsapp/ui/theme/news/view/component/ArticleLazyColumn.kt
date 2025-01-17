package com.example.newsapp.ui.news.view.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.paging.compose.LazyPagingItems
import com.example.newsapp.R
import com.example.newsapp.domain.model.Article

@Composable
fun ArticleLazyColumn(
    paddingValues: PaddingValues,
    articles: LazyPagingItems<Article>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .padding(paddingValues)
    ) {
        items(articles.itemCount) {
            key(it) {
                NewsDetails(article = articles[it]!!)

                Spacer(
                    modifier = Modifier.padding(
                        dimensionResource(id = R.dimen.all_paddin)
                    )
                )
            }
        }
    }
}