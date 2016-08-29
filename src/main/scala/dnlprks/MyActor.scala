package dnlprks

import akka.actor.Actor

class MyActor extends Actor {
  def receive: Receive = {
    case "begin" => println("So it begins")
    case "hi" => println("Hi World")
  }
}
