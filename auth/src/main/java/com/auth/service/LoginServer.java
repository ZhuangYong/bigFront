package com.auth.service;

import io.vertx.core.json.JsonObject;
import org.rayeye.vertx.annotations.VerticleMapping;
import org.rayeye.vertx.result.ResultOb;
import org.springframework.stereotype.Service;

@VerticleMapping
@Service
public class LoginServer {
    public JsonObject testLogin(JsonObject parm) throws Exception {
        return new JsonObject(ResultOb.build().setMsg("api test login").toString());
    }
}
