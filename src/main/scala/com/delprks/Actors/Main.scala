package com.delprks.Actors

import akka.actor.{ActorSystem, Props}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.language.postfixOps

object Main extends App {
  val system = ActorSystem("PublisherSystem")
  val actor = system.actorOf(Props[PublisherActor], name = "publisher-actor")
  actor ! "Start"
  system.scheduler.schedule(5 seconds, 10 seconds, actor, "PublishToCloudWatch")
}
