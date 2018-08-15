//Parameterized constructor

class employee1(ename:String,eno:Int)
{
  var empname=ename
  var empno=eno
  
  def showdetails() = {
    println("employee name: "+ename)
    println("empno: "+eno)
  }
  
}

object empdetailsparam
{
 
  def main(args:Array[String])
  {
    var e=new employee1("Chaitanya",101)
    e.showdetails()
  }
  
}