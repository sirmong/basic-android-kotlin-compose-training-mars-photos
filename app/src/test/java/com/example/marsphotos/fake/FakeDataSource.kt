package com.example.marsphotos.fake

import com.example.marsphotos.network.MarsPhoto

object FakeDataSource {
    private const val idOne = "img1"
    private const val idTwo = "img2"
    private const val imageOne = "url.1"
    private const val imageTwo = "url.2"

    val photosList = listOf(MarsPhoto(idOne, imageOne), MarsPhoto(idTwo, imageTwo))
}