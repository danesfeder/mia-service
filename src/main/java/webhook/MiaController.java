package webhook;

import ai.api.model.AIResponse;
import data.Test;
import data.WebhookResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/action")
public class MiaController {

    @RequestMapping(value = "/showRoute",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public WebhookResponse showRoute(@RequestBody AIResponse request) {
        return new WebhookResponse("Speech: " + request.getResult().getFulfillment().getSpeech(),
                "Resolved Query: " + request.getResult().getResolvedQuery(),
                "MiaWebhook");
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Test test() {
        return new Test("MiaService is up and running!");
    }
}
