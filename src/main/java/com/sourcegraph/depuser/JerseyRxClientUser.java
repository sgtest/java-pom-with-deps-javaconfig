package com.sourcegraph.depuser;

import org.glassfish.jersey.client.rx.RxClient;
import org.glassfish.jersey.client.rx.guava.RxListenableFutureInvoker;


/**
 * Created by beyang on 8/7/17.
 */
public class JerseyRxClientUser {
    private RxClient<RxListenableFutureInvoker> client;
}
