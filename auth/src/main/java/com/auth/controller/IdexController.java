package com.auth.controller;

import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;
import org.rayeye.vertx.annotations.RouteHandler;
import org.rayeye.vertx.annotations.RouteMapping;
import org.rayeye.vertx.annotations.RouteMethod;
import org.rayeye.vertx.http.SenderInvokeHandler;
import org.rayeye.vertx.result.ResultOb;
import org.rayeye.vertx.util.ParamUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RouteHandler("auth")
public class IdexController extends SenderInvokeHandler{
    Logger logger = LoggerFactory.getLogger(IdexController.class);
    @RouteMapping(value = "/test", method = RouteMethod.GET)
    public Handler<RoutingContext> doTest() {
        return ctx -> {
            JsonObject param = ParamUtil.getRequestParams(ctx);
            logger.debug("参数:"+param.encode());
            ctx.response().setStatusCode(200);
            ctx.response().end(ResultOb.build().setMsg("api test 111").toString());
        };
    }

}
