package data;

public class WebhookResponse {

    private String speech;
    private String displayText;
    private String source;

    public WebhookResponse() {
    }

    public WebhookResponse(String speech, String displayText, String source) {
        this.speech = speech;
        this.displayText = displayText;
        this.source = source;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
