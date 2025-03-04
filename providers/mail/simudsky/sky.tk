package com.github.simud04.providers.mail.simudsky

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

class SkyStreamingProvider : MainAPI() {
    override var mainUrl = "https://skystreaming.media"
    override var name = "SkyStreaming"
    override val hasMainPage = true
    override val supportedTypes = setOf(TvType.Live)

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val document = app.get(mainUrl).document
        val categories = document.select(".sport-list a")

        val homePageList = categories.map {
            val name = it.text()
            val link = it.attr("href")
            HomePageList(name, getEvents(link))
        }
        return HomePageResponse(homePageList)
    }

    private fun getEvents(url: String): List<SearchResponse> {
        val document = app.get(url).document
        return document.select(".event-item").mapNotNull {
        


import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

class SkyStreamingProvider : MainAPI() {
    override var mainUrl = "https://skystreaming.media"
    override var name = "SkyStreaming"
    override val hasMainPage = true
    override val supportedTypes = setOf(TvType.Live)

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val document = app.get(mainUrl).document
        val categories = document.select(".sport-list a")

        val homePageList = categories.map {
            val name = it.text()
            val link = it.attr("href")
            HomePageList(name, getEvents(link))
        }
        return HomePageResponse(homePageList)
    }

    private fun getEvents(url: String): List<SearchResponse> {
        val document = app.get(url).document
        return document.select(".event-item").mapNotNull {
            val title = it.selectFirst(".event-title")?.text() ?: return@mapNotNull null
            val link = it.selectFirst("a")?.attr("href") ?: return@mapNotNull null
            val img = it.selectFirst("img")?.attr("src") ?: ""
            LiveSearchResponse(
                title,
                link,
                this.name,
                TvType.Live,
                img,
                null,
                null
            )
        }
    }

    override suspend fun load(url: String): LoadResponse {
        val document = app.get(url).document
        val streamUrl = document.selectFirst("iframe")?.attr("src") ?: throw ErrorLoadingException("Stream non trovato")
        return LiveLinkResponse(url, this.name, streamUrl)
    }
}
