package org.jai.reddybrains;

import org.jai.reddybrains.model.Message;
import org.jai.reddybrains.service.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/messages")
public class MessageResource {

    MessageService messageService = new MessageService();

   // @GET
   // @Produces(MediaType.TEXT_PLAIN)
   // public String getMessages() {
      //  return "HelloWorld";


    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages(){
        return messageService.getAllMessages();
    }

}
