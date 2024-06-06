object TrueRing {
  def rule = println("To rule them all")
}
TrueRing.rule

class Person(val name: String) {
  def talk(message: String) = println(name + " says " + message)
  def id(): String = name 
}

class Employee(override val name: String, val number : Int) extends Person(name) {
  //kind of odd that you just override the whole contructore like that but i guess it makes sense 
  override def talk(message: String) {
    println(name + " with number " + number + " says " + message)
  }
  override def id():String = number.toString
}

val employee = new Employee("Yoda",4)
employee.talk("oooga booga")

trait ned {
  def greet() = println("diddly doodly")
}

class Character(override val name:String) extends Person(name) with ned

val flanders = new Character("Ned")
flanders.greet

class ticTacToe () {
  var board: List[Any] = List(1,2,3,4,5,6,7,8,9)
  val turn = 0
  play(turn, board)
  
  //problem: These lits are imutable. unclear how to proceed efficiently 
  def check(nboard: List[Any]): Boolean = {
    var i = 0;
    while (i<3) {
      if ((nboard(i)== nboard(3+i)) & (nboard(i) == nboard(i+6))) {return true}
      else if  ((nboard(0 + 3*i )== nboard( 1 + 3*i )) & (nboard( 0 + 3*i  ) == nboard( 2 + 3*i  ))) {return true}
      else if ((nboard(0) == nboard(4)) & ((nboard(0) == nboard(8)))) {return true}
      else if ((nboard(2) == nboard(4)) & ((nboard(2) == nboard(6)))) {return true}
      i = i+1
    }
    return false
  }

  def play(turn: Int, b: List[Any]) : Int ={
    
      println(b)  
      var a = scala.io.StdIn.readInt();
      var newBoard: List[Any] = b.updated(a-1, (if (turn % 2 == 0) "O" else "X"));
      if (check(newBoard)) {
        (if (turn%2 == 0) println("Player One Has Won") else println("Player Two Has Won"));
        return 1;
      } else if (turn == 8){
        println(newBoard) 
        println("Tie")
        return 0;
      }
     
    play(turn+1,newBoard)

  }

}

val tic = new ticTacToe()
