object funtionsexample
{
  
  
  def add(a:Int,b:Int):Int={   //Method1 : parameters & Return data type and return keyword
    return a+b
  }
  
  def sub(a:Int,b:Int):Int={  //Method2 : parameters & Return data type and  no return keyword
    a-b
  }
  
  def mult(a:Int,b:Int):Int=a*b //Method3 : parameters & Return data type & no return keyword & No parenthesis
  
  def divide(a:Int,b:Int)=a/b //Method4 : parameters & No Return data type & no return keyword & No parenthesis
  
  object math {    //Method5 : function in another new object
    def add(a:Int,b:Int)=a+b
  }
  
  def main(args: Array[String])
  {
    println("This is to explain functions in scala")
    println(add(3,7))  
    println(sub(8,3))
    println(mult(3,5))
    println(divide(9,3))
    println(math.add(3,5))
    
    
  }
}