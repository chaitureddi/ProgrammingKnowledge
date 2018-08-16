object whiledowhile
{
  def main(args: Array[String])
  {
    // we should define only var values because val cannot increment values in loops
    
    var x_false = 0
    var x_true = 0
    var y_false = 0
    var y_true = 0
    
    // While works when condition is true
    
    while (x_false < 0) // It does not print any value in the output console
    {
      println("x_false = "+x_false)
      x_false +=1
    }
    
    while (x_true<10)
    {
      println("x_true = "+x_true)
      x_true +=1
    }
    
    
    // Do while at least works with one loop
    
    do {
      println("y_false = "+y_false)
      y_false +=1
      
    } while (y_false<0)   // It prints one value in output console
      
    do {
      println("y_true = "+y_true)
      y_true +=1
    } while(y_true<10)
  }
}