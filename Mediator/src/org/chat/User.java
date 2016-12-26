package org.chat;

import org.chat.abstrsacts.AbsUser;
import org.chat.interfaces.IChatMediator;

/**
 * Created by Robert Szczygielski on 26.12.16.
 */
public class User extends AbsUser {
    public User(IChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " send: " + message);
        chatMediator.sendMessage(this, message);
    }

    @Override
    public void received(String message) {
        System.out.println(name + " received: " + message);
    }
}
