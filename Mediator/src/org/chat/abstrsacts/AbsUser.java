package org.chat.abstrsacts;

import org.chat.interfaces.IChatMediator;

/**
 * Created by Robert Szczygielski on 26.12.16.
 */
public abstract class AbsUser {
    protected IChatMediator chatMediator;
    protected String name;

    public AbsUser(IChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void received(String message);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbsUser absUser = (AbsUser) o;

        if (chatMediator != null ? !chatMediator.equals(absUser.chatMediator) : absUser.chatMediator != null)
            return false;
        return name != null ? name.equals(absUser.name) : absUser.name == null;
    }

    @Override
    public int hashCode() {
        int result = chatMediator != null ? chatMediator.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
