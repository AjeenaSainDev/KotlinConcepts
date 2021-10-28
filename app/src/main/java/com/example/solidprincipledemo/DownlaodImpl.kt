package com.example.solidprincipledemo

class DownlaodImpl(val file:String) :Downloader {
    override fun imageFileDown() {
        println("download file done $file")
    }
}