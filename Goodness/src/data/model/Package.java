package data.model;

import java.time.LocalDateTime;
import java.util.List;

public class Package {
    private int id;
    private double weightInGrammes;
    private User sender;
    private User receiverDetails;
    private LocalDateTime timeStamp;
    private List<Event>events;
    private boolean payOnDelivery;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public double getWeightInGrammes() {
//        return weightInGrammes;
//    }
//
//    public void setWeightInGrammes(double weightInGrammes) {
//        this.weightInGrammes = weightInGrammes;
//    }
//
//    public User getSender() {
//        return sender;
//    }
//
//    public void setSender(User sender) {
//        this.sender = sender;
//    }
//
//    public User getReceiverDetails() {
//        return receiverDetails;
//    }
//
//    public void setReceiverDetails(User receiverDetails) {
//        this.receiverDetails = receiverDetails;
//    }
//
//    public LocalDateTime getTimeStamp() {
//        return timeStamp;
//    }
//
//    public void setTimeStamp(LocalDateTime timeStamp) {
//        this.timeStamp = timeStamp;
//    }
//
//    public List<Event> getEvents() {
//        return events;
//    }
//
//    public void setStatus(List<Event> events) {
//        this.events = events;
//    }
//
//    public boolean isPayOnDelivery() {
//        return payOnDelivery;
//    }
//
//    public void setPayOnDelivery(boolean payOnDelivery) {
//        this.payOnDelivery = payOnDelivery;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeightInGrammes() {
        return weightInGrammes;
    }

    public void setWeightInGrammes(double weightInGrammes) {
        this.weightInGrammes = weightInGrammes;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiverDetails() {
        return receiverDetails;
    }

    public void setReceiverDetails(User receiverDetails) {
        this.receiverDetails = receiverDetails;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public boolean isPayOnDelivery() {
        return payOnDelivery;
    }

    public void setPayOnDelivery(boolean payOnDelivery) {
        this.payOnDelivery = payOnDelivery;
    }
}
