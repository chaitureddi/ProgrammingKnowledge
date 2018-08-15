object ifelsedemo
{
  def main(args:Array[String])
  {
    println("This is ifelse statement example")
    var x = 50
    var y =35
    
    if (x == 20) {
      println("X is 20")
    }
    else if (x == 30) {
      println("x is 30")
    }
    else if (x > 40 && y < 70) {
      println("x is greater than 40 and y is less than 70")
    }
        
    else
      println("X is not 30 nor 20")
  }
}