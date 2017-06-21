package com.projects.kotlin.kotlindemo.restful

import org.glassfish.jersey.server.ResourceConfig
import org.springframework.stereotype.Component

/**
 * Created by glady on 21.06.2017.
 */
@Component
class JerseyConfig: ResourceConfig
{
    constructor() {
        //the word package is reserved
       packages(JerseyConfig:: class.java.`package`.name)
    }
}