val lines = scala.io.Source.fromFile("map.txt").mkString.split("\n")
val left = lines.map(i => {val n = i.split(" "); (n(0),n(1)) });
val combined = left.toMap
println(combined)
