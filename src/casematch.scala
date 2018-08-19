object casematch
{
  def main(args: Array[String])
  {
    println("This is to explain case statement in scala")
    val a = 100
    a match
    {
      
      case 10 => println("It is 10")
      case 20 => println("it is 20")
      case 30 => println("It is 30")
      case _ => println("default") // _ symbol is to define default values (When no match found).. to avoid scala.MatchError error
    }
    
    var res = a match { //This is to store a result of a match case to a variable
      
      case 10 => a
      case 20 => a
      case 30 => a
      case _ => a
    }
    
    println("result is = "+res)
    
    val i = 7
    
    i match // This is to put multiple matches in single case statement .. | works as or condition
    
    {
      case 1|3|5|7 => println("odd")
      
      case 2|4|6|8 => println("even")
    }
  }
}