def doChore(chore:String):String = chore match {
  case "clean dishes" => "scrub, dry"
  case "cook dinner" => "Chop, size"
  case _ => "Whine, complain"
}

println(doChore("clean dishes"))

def factorial(n: Int):Int = n match {
  case 0 => 1
  case x if x>0  => factorial(n - 1) * n 
}

println(factorial(3))

val reg = """^(F|f)\w*""".r
println(reg.findFirstIn("Fantastic"))
println(reg.findFirstIn("Not Fantasitc"))

val reg2 = "the".r
println(reg2.findAllIn("the way the scisors trim the hair and the shrubs").foreach(i => println(i)))


