package org.jai.reddybrains.service;

import org.jai.reddybrains.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageService {

    public List<Message> getAllMessages(){
        Message m1 = new Message(1L, "Hey Hai", "Jai");
        Message m2 = new Message(2L, "I am Fine", "Ravi");
        List<Message> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        return list;

    }
}
