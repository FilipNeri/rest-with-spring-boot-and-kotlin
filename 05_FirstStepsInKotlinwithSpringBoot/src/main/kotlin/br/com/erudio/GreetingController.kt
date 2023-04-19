package br.com.erudio;

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong


@RestController
class GreetingController {
    val counter: AtomicLong = AtomicLong()
//mapeando as rotas
    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value="name",defaultValue ="World" ) name: String? ): Greeting {//adicionando os paramentros
        return Greeting(counter.incrementAndGet(),"Hello, $name!")
    }
}
