package org.chat;

import org.chat.abstrsacts.AbsUser;
import org.chat.interfaces.IChatMediator;
import org.junit.Test;

/**
 * Created by Robert Szczygielski on 26.12.16.
 */
public class UserTest {
    @Test
    public void sillyTest() throws Exception {
        IChatMediator chatMediator = new ChatMediator();
        AbsUser u1 = new User(chatMediator, "First");
        AbsUser u2 = new User(chatMediator, "Sec");
        AbsUser u3 = new User(chatMediator, "3th");
        chatMediator.addUser(u1);
        chatMediator.addUser(u2);
        chatMediator.addUser(u3);

        u3.send("Hello W!!");
    }

}
