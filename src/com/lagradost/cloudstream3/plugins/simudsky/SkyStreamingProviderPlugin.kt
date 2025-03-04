package com.github.simud04.src.com.lagradost.cloudstream3.plugins.simudsky

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

class SkyStreamingProvider : CloudstreamPlugin() {
    override var mainUrl = "https://skystreaming.media"
    override var name = "SkyStreaming"
    override val hasMainPage = true
    override val supportedTypes = setOf(TvType.Live)
    // Altre funzioni
}
