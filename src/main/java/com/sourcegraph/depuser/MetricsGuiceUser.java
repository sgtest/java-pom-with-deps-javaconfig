package com.sourcegraph.depuser;

import com.palominolabs.metrics.guice.MetricsInstrumentationModule;

/**
 * Created by beyang on 3/21/17.
 */
public class MetricsGuiceUser {
    public void useMetricsGuice() {
        MetricsInstrumentationModule.builder();
    }
}
