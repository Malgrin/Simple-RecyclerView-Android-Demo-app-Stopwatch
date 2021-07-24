package com.example.stopwatch.adapter

data class Stopwatch(
    val id: Int,
    var currentMs: Long,
    var isStarted: Boolean
)