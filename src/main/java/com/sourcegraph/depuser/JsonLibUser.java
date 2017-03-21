package com.sourcegraph.depuser;

import net.sf.json.JSONObject;
import net.sf.json.groovy.JsonSlurper;

/**
 * Created by beyang on 3/20/17.
 */
public class JsonLibUser {
    public static JSONObject getObj() {
        return (JSONObject) new JsonSlurper().parseText("{}");
    }
}
