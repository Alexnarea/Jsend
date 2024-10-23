package com.example.Jsend.controller

import com.example.Jsend.model.Client
import com.example.Jsend.response.ErrorRes
import com.example.Jsend.response.FailResponse
import com.example.Jsend.response.SuccessResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping()
class JsendController() {
    @GetMapping("/success")
    fun success(): SuccessResponse {
        return SuccessResponse().apply {
            status = "success"
            data = Client().apply {
                id = 1
                username = "Alexis narea"
                mail = "narea@hmail.com"
                age = 23
            }
        }
    }
    @GetMapping("/fail")
    fun fail(): FailResponse {
        return FailResponse().apply {
            status = "fail"
            data = Client().apply {
                mail = "El campo email es obligatorio"
            }
        }
    }

    @GetMapping("/error")
    fun error(): ErrorRes {
        return ErrorRes().apply {
            status = "error"
            message = "Unable to communicate with dtabase"
            code = 500
        }

    }
    hola
}