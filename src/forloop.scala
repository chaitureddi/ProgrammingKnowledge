object forloop
{
  def main(args: Array[String])
  {
    println("This program is to explain multiple options in for loop")
    
    for (i <- 1 to 5) // For loop  using 'to' condition 
    {
      println("i using to : "+i)
    }
    
    for (i<- 1 until 6) // For loop using 'until' condition -- until 6 means it prints till 5
    {
      println("i using until : " +i)
    } 
    
    for (i<-1 to 5;j<-1 to 4) // For loop for multiple variables by specifying semicolon between two variables
    
    {
      println("For loop with multiple variables : " +i +" " +j)
    }
    
    var lst = List(1,2,4,6,3,7,18,64)
    
    for (i<-lst) // Print elements in a list
    {
      println("List of elements in lst is: "+i)
    }
    
    for (i<-lst;if i <6) // Print elements in a list with a filter
    {
      println("List of elements with filter : "+i)
    }
    
    
    var result = for {i<-lst; if i<6} yield {i*i} // Evaluating a list with for loop
    println("Square of Lst is : "+result)
    
  }
}