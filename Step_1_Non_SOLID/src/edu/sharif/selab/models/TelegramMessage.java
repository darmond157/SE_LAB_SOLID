package edu.sharif.selab.models;

public class TelegramMessage extends Message {

    private String sourceId;
    private String targetId;

    public String getSourceId() {
        return sourceId;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }
}
