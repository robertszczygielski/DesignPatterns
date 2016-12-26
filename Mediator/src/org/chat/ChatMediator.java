package org.chat;

import org.chat.abstrsacts.AbsUser;
import org.chat.interfaces.IChatMediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robert Szczygielski on 26.12.16.
 */
public class ChatMediator implements IChatMediator {
    List<AbsUser> users = new ArrayList<>();

    @Override
    public void sendMessage(AbsUser user, String message) {
        for (AbsUser u : users) {
            if(!u.equals(user)) {
                u.received(message);
            }
        }
    }

    @Override
    public void addUser(AbsUser user) {
        users.add(user);
    }
}
