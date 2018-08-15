class student {
  
var sname="chaitu"
var sno=101
var age=20


def show() = {
  
println("Name: "+sname)
println("Student Number: "+sno)
println("age: "+age)

}
}


object studetails
{
  def main(args:Array[String])
  {
    var s= new student
    s.show()
  }
}

