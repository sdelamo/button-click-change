package com.modernfrontendshtmx;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Status;
import io.micronaut.views.View;

@Controller
class HomeController {

    @View("index.html")
    @Get
    @Status(HttpStatus.OK)
    void index() {}

    @View("htmx.html")
    @Get("/htmx")
    @Status(HttpStatus.OK)
    void htmx() {}

}
