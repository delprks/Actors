package dnlprks

import akka.actor.{Actor, ActorSystem, Props}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.language.postfixOps

object Main extends App {
  val system = ActorSystem("MySystem")
  val actor = system.actorOf(Props[MyActor], name = "myactor")
  actor ! "begin"
  system.scheduler.schedule(5 seconds, 10 seconds, actor, "hi")
}
