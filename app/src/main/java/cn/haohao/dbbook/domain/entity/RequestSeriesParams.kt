package cn.haohao.dbbook.domain.entity

/**
 * Created by HaohaoChang on 2017/6/9.
 */
data class RequestSeriesParams(var seriesId: String, var start: Int = 0, var count: Int = 0, var fields: String)