/*
 * Copyright (C) 2015 Actor LLC. <https://actor.im>
 */

package im.actor.model.concurrency;

import com.google.j2objc.annotations.ObjectiveCName;

public interface Command<T> {
    @ObjectiveCName("startWithCallback:")
    void start(CommandCallback<T> callback);
}
