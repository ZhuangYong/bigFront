package com.auth.runner;

import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import org.rayeye.vertx.DeployVertxServer;
import org.rayeye.vertx.standard.StandardVertxUtil;
import org.rayeye.vertx.verticle.RouterHandlerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class dev {
    Logger logger = LoggerFactory.getLogger(dev.class);
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StandardVertxUtil.getStandardVertx(Vertx.vertx(new VertxOptions()));
        DeployVertxServer.startDeploy(new RouterHandlerFactory("com.auth.controller", "api").createRouter(), "com.auth.service", 9988);
    }
}
