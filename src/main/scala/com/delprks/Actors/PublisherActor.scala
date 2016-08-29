package com.delprks.Actors

import java.util.Calendar
import akka.actor.Actor
import scala.util.{Failure, Success}
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class PublisherActor extends Actor {
  def receive: Receive = {
    case "Start" => println("Starting the application at " + Calendar.getInstance().getTime.toString)
    case "PublishToCloudWatch" => publishToCloudWatch onComplete {
      case Success(s) => println(s)
      case Failure(f) => println("an error occurred " + f.getMessage)
    }
  }

  def publishToCloudWatch: Future[String] = Future {
    "Publishing to CloudWatch at " + Calendar.getInstance().getTime.toString
  }
}
