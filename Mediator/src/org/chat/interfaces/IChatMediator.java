package org.chat.interfaces;

import org.chat.abstrsacts.AbsUser;

/**
 * Created by Robert Szczygielski on 26.12.16.
 */
public interface IChatMediator {
    void sendMessage(AbsUser user, String message);
    void addUser(AbsUser user);
}
