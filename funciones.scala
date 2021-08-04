// Ejemplo de función en Scala
def strToInt(str: String) = str.split(" ").filter(_!="").map(_.toInt)

// Ejemplo de función recursiva
def gcd(a:Int, b:Int):Int = {
  if(a == b) a
  else if (a > b) gcd(a - b, b)
  else gcd(a, b - a)
}


