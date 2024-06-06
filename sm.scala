import scala.io.Source 

var M = Map()
val filename = "map.txt"

val myMap = io.Source
              .fromFile("junk.txt")             // open the file
              .mkString                         // turn it into one long String
              .split("(?=\\n\\S+\\s*->)")       // a non-consuming split
              .map(_.trim.split("\\s*->\\s*"))  // split each element at "->"
              .map(arr => (arr(0)->arr(1)))     // from 2-element Array to tuple
              .toMap       
