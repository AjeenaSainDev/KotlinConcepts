package com.example.solidprincipledemo

fun main(){
val imagefile ="pic.jpeg"
val mediafile ="media.mvk"
val medaiFile = MedaiFile(DownlaodImpl(imagefile),PlayerImpl(mediafile))
    medaiFile.imageFileDown()
    medaiFile.playerMedia()

}

class MedaiFile(private  val downloader: Downloader,private val player: Player) :Downloader by downloader,Player by player