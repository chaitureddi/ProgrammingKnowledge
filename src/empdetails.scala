class employee
{
  var empname="Chaitanya"
  var empid="63NFL"
  
  def show() = {
    println("empname: "+empname)
    println("empid: "+empid)
  }
}

object empdetails
{
  def main(args:Array[String]) {
    
    var a = new employee
    a.show()
  }
}