package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class WebhookController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/miawebhook")
    public WebhookResponse greeting(@RequestParam(value= "name", defaultValue = "World") String name) {
        return new WebhookResponse(counter.incrementAndGet(), String.format(template, name));
    }
}