package com.example.solidprincipledemo

class PlayerImpl(val maedia_file: String ):Player {
    override fun playerMedia() {
        println("play maedia_file done $maedia_file")
    }
}