import "org.scala-lang" % "scala-actors" % "2.10.0-M6"


case object Poke 
case object Feed

class Kid() extends Actor {
  def act() {
  loop{
    react {
        case Poke => {println("Ow")} 
        case Feed => {println("Yummy")}
    }
      }
    }
}

val bart = new Kid().start 
val lisa = new Kid().start 
bart ! Poke 
lisa ! Poke 
bart ! Feed
