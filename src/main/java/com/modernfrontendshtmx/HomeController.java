package com.modernfrontendshtmx;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Status;
import io.micronaut.views.ModelAndView;
import io.micronaut.views.View;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
class HomeController {

    private AtomicInteger counter = new AtomicInteger();

    @View("index.html")
    @Get
    @Status(HttpStatus.OK)
    void index() {}

    @Get("/htmx")
    @Status(HttpStatus.OK)
    ModelAndView htmx() {
        return new ModelAndView("htmx.html", Map.of("counter", this.counter.getAndIncrement()));
    }

}
