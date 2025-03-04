package com.jorgedelira.udemy.vertx_starter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;

public class MainVerticle extends AbstractVerticle {

  public static void main(String[] args) {
    Vertx.vertx();
    final Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new com.jorgedelira.udemy.vertx_starter.MainVerticle());
  }

  @Override
  public void start(final Promise<Void> startPromise) throws Exception {
    System.out.println("Start " + getClass().getName());
    vertx.deployVerticle(new VerticleA());
    vertx.deployVerticle(new VerticleB());
    startPromise.complete();
  }
}
