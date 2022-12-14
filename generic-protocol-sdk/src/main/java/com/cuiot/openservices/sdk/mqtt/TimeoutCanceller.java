package com.cuiot.openservices.sdk.mqtt;

import io.netty.util.Timeout;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.FutureListener;

/**
 * @author unicom
 */
public class TimeoutCanceller<V> implements FutureListener<V> {

    private final Timeout timeout;

    public TimeoutCanceller(Timeout timeout) {
        this.timeout = timeout;
    }

    @Override
    public void operationComplete(Future<V> future) throws Exception {
        timeout.cancel();
    }
}
