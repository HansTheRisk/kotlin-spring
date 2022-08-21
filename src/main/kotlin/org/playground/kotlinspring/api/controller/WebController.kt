package org.playground.kotlinspring.api.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WebController {
    @GetMapping("/")
    fun blog(model: Model) : String {
        model.addAttribute("title", "Blog")
        return "blog"
    }

}