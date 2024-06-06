def forLoop {
  println("for loop, nice")
  for(i <- 0 until args.length) {
    println(args(i))
  }
}

forLoop
