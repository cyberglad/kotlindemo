package com.projects.kotlin.kotlindemo.service
import org.springframework.stereotype.Component
/**
 * Created by glady on 21.06.2017.
 */

@Component
class GreetService{

    interface Resp {
        class Success(val msg: String): Resp
        class Error(): Resp
    }
    fun greet(name: String): Resp {
        return if (name.equals("R21"))
            Resp.Error()
        else
            Resp.Success("Hello, ${name}")
    }
}