package com.example.kotlinpracticedeepwithspringboot.apis

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v/")
class Controller {

    @GetMapping("/world")
    fun track():String {
        return "deep has tested"
    }
    @GetMapping("/tntra")
    fun track2():String {
        return "Tntra"
    }
    @GetMapping("/")
    fun track3():String {

        return "Kotlin practice has been started"
    }
    @GetMapping("/testpost/{id}")
    fun track4(@PathVariable id:String):String{

        return id;
    }


}